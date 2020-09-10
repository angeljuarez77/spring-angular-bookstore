package com.example.server.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import com.example.server.models.User;
import com.example.server.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping("/listall")
    public Iterable<User> allUsers() {
        return userService.listUsers();
    }

    @PostMapping("/signup")
    public User signUp(@RequestBody User user) {
        return userService.createUser(user);
    }

    @PostMapping("/login")
    public User logIn(@RequestBody User user) {
        return userService.logIn(user.getUsername(), user.getPassword());
    }

    @DeleteMapping("/{userid}")
    public HttpStatus deleteUser(@PathVariable Long userid) {
        return userService.deleteById(userid);
    }

}
