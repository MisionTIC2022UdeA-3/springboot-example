package com.example.demo.services;

import com.example.demo.entities.User;
import com.example.demo.repositories.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private UserRepository repository;
    public UserService(UserRepository repository){
        this.repository = repository;
    }

    public User createUser(User newUser){
        return this.repository.save(newUser);
    }

    public User getUser(String email){
        return this.repository.findByEmail(email);
    }

}
