package com.thebrandonbunch.blog.comments;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/comments")
public class CommentsController {
    @Autowired
    private CommentsService commentsService;
    @GetMapping("/{postId}")
    public ResponseEntity<List<Comments>> getCommentsByPostId(@PathVariable String postId) {
         return new ResponseEntity<List<Comments>>(commentsService.getAllPostComments(postId), HttpStatus.OK);
    }
}
