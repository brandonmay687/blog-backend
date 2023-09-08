package com.thebrandonbunch.blog.posts;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PostsRepository extends MongoRepository<Posts, ObjectId> {
    Optional<Posts> findByPostId(String postId);
}

