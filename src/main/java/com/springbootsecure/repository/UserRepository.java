package com.springbootsecure.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.springbootsecure.model.User;

public interface UserRepository extends MongoRepository< User, String>{
  
  public User findByUsername(String username); 
}