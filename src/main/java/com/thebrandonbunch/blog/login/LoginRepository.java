package com.thebrandonbunch.blog.login;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface LoginRepository extends MongoRepository<Login, ObjectId> {
    Optional<Login> findLoginById(String userId);
}
