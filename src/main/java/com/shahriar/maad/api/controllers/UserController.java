package com.shahriar.maad.api.controllers;

import com.shahriar.maad.api.entities.User;
import com.shahriar.maad.api.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/api")
public class UserController {

    @Autowired
    public UserService userService;

    @PostMapping("/user")
    public ResponseEntity<User> createUser(@RequestBody User user){

        User savedUser = userService.crateUser(user);
        return new ResponseEntity<>(savedUser, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<User>> getAllUser(){

        List<User> users = userService.getAllUser();

        return new ResponseEntity<>(users, HttpStatus.OK);
    }
}
