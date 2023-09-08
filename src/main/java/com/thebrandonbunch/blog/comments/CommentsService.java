package com.thebrandonbunch.blog.comments;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CommentsService {
    @Autowired
    private CommentsRepository commentsRepository;
    public List<Comments> getAllPostComments(String postId) {
        return commentsRepository.findCommentsByPostId(postId);
    }
}
