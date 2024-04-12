package com.example.demo.database.mongoDB.interfaceP;

import com.example.demo.database.mongoDB.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<User, String> {
    @Query("{'username' : ?0}")
    User findByUsername(String username);
}