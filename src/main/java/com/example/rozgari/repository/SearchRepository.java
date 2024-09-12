package com.example.rozgari.repository;

import com.example.rozgari.model.Post.java


import java.util.List;

public interface SearchRepository {

    List<Post> findByText(String text);

}