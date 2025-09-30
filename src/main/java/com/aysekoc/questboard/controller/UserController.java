package com.aysekoc.questboard.controller;

import com.aysekoc.questboard.dto.Task.request.TaskCreateRequestDto;
import com.aysekoc.questboard.dto.User.response.UserLoginResponseDto;
import com.aysekoc.questboard.dto.User.request.UserCreateRequestDto;
import com.aysekoc.questboard.dto.User.request.UserLoginRequestDto;
import com.aysekoc.questboard.entity.User;
import com.aysekoc.questboard.service.abstracts.UserService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api/users")
@AllArgsConstructor
public class UserController {

    private final UserService userService;


    @PostMapping("/register")
    public String register(@RequestBody (required = false) UserCreateRequestDto createUserDto) {
        userService.register(createUserDto);
        return "User Registration Successful!";
    }

    @PostMapping("/login")
    public String login(@RequestBody UserLoginRequestDto loginUserDto) {
        userService.login(loginUserDto);
        return "User Login Successful!";
    }


    @GetMapping("/listAll")
    public List<User> listAll(){
        return userService.listAll();
    }

    @GetMapping("/list/username")
    public UserLoginResponseDto listUsername(@RequestParam UserLoginRequestDto username){

        return null;
    }

    @GetMapping("/{id}/tasks")
    public TaskCreateRequestDto listtasks(@PathVariable Long id){
       userService.getTaskStatusId(id);
       return null;

    }

    @DeleteMapping("/delete")
    public void delete(@RequestParam Long id){
        System.out.println(id + " silindi!");
    }

}
