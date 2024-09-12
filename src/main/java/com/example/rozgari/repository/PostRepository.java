package com.example.rozgari.repository;

import com.example.rozgari.model.Post.java
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PostRepository extends MongoRepository<Post,String>
{

}
