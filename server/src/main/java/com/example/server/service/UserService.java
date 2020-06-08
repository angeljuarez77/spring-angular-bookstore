package com.example.server.service;

import com.example.server.models.User;

public interface UserService {
    public Iterable<User> listUsers();
    public User createUser(User user);
}
