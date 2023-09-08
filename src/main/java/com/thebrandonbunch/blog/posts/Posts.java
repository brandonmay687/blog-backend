package com.thebrandonbunch.blog.posts;

import com.thebrandonbunch.blog.Comments;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

import java.time.LocalDateTime;
import java.util.List;

@Document(collection = "posts")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Posts {
    @Id
    private ObjectId id;
    private String postId;
    private String title;
    private String content;
    private int likes;
    private int dislikes;
    private String date;
    @DocumentReference
    private List<Comments> comments;
    private LocalDateTime dateTime;
}

