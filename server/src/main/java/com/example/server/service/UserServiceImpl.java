package com.example.server.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.example.server.models.User;
import com.example.server.repositories.UserRepository;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public Iterable<User> listUsers() {
        return userRepository.findAll();
    }

    @Override
    public User createUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public User logIn(String username, String password) {
        return userRepository.login(username, password);
    }

    @Override
    public HttpStatus deleteById(Long userId) {
        userRepository.deleteById(userId);
        return HttpStatus.OK;
    }
}
