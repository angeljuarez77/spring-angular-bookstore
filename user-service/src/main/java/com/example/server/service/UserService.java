package com.example.server.service;

import org.springframework.http.HttpStatus;

import com.example.server.models.User;

public interface UserService {
    public Iterable<User> listUsers();
    public User createUser(User user);
    public User logIn(String username, String password);
    public HttpStatus deleteById(Long userId);
}
