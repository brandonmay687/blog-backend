package com.thebrandonbunch.blog.posts;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/posts")
public class PostsController {
    @Autowired
    private PostsService postsService;
    @GetMapping
    public ResponseEntity<List<Posts>> getAllPosts() {
        return new ResponseEntity<List<Posts>>(postsService.allPosts(), HttpStatus.OK);
    }

    @GetMapping("/{postId}")
    public ResponseEntity<Optional<Posts>> getSinglePost(@PathVariable String postId) {
        return new ResponseEntity<Optional<Posts>>(postsService.singlePost(postId), HttpStatus.OK);
    }
}

