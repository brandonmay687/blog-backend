package com.thebrandonbunch.blog.comments;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

import java.time.LocalDateTime;

@Document(collection = "comments")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Comments {
    @Id
    private ObjectId id;
    private String commentId;
    private String postId;
    private String username;
    private String content;
    private int likes;
    private int dislikes;
    private LocalDateTime dateTime;
}
