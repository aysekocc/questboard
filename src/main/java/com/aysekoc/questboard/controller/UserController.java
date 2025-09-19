package com.aysekoc.questboard.controller;

import com.aysekoc.questboard.dto.User.CreateUserDto;
import com.aysekoc.questboard.service.abstracts.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public String register(@RequestBody (required = false) CreateUserDto createUserDto) {
        userService.createUser(createUserDto);
        return "User Registration Successful!";
    }

    @PostMapping("/login")
    public String login(@RequestBody CreateUserDto createUserDto) {
        CreateUserDto createUserDto1=new CreateUserDto();
        createUserDto1.setUsername(createUserDto.getUsername());
        createUserDto1.setPassword(createUserDto.getPassword());
        return "User Login Successful!";
    }
}
