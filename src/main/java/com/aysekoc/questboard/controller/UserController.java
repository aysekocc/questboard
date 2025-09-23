package com.aysekoc.questboard.controller;

import com.aysekoc.questboard.dto.Task.request.TaskStatusRequestDto;
import com.aysekoc.questboard.dto.User.LoginUserResponseDto;
import com.aysekoc.questboard.dto.User.request.CreateUserRequestDto;
import com.aysekoc.questboard.dto.User.request.LoginUserRequestDto;
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
    public String register(@RequestBody (required = false) CreateUserRequestDto createUserDto) {
        userService.register(createUserDto);
        return "User Registration Successful!";
    }

    @PostMapping("/login")
    public String login(@RequestBody LoginUserRequestDto loginUserDto) {
        userService.login(loginUserDto);
        return "User Login Successful!";
    }

    @GetMapping("/{id}/quests")
    public TaskStatusRequestDto listquests(@PathVariable Long id){
       userService.getTaskStatusId(id);
       return null;

    }

    @GetMapping("/listAll")
    public List<User> listAll(){
        return userService.listAll();
    }

    @GetMapping("/list/username")
    public LoginUserResponseDto listUsername(@RequestParam LoginUserRequestDto username){
        return null;
    }

    @DeleteMapping("/delete")
    public void delete(@RequestParam Long id){
        System.out.println(id + " silindi!");
    }

}
