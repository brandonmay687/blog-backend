package com.thebrandonbunch.blog.posts;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PostsService {
    @Autowired
    private PostsRepository postsRepository;
    public List<Posts> allPosts() {
        return postsRepository.findAll();
    }

    public Optional<Posts> singlePost(String postId) {
        return postsRepository.findByPostId(postId);
    }
}

