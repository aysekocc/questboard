package com.aysekoc.questboard.service.abstracts;

import com.aysekoc.questboard.dto.Task.response.TaskStatusResponseDto;
import com.aysekoc.questboard.dto.User.request.CreateUserRequestDto;
import com.aysekoc.questboard.dto.User.request.LoginUserRequestDto;
import com.aysekoc.questboard.dto.User.LoginUserResponseDto;
import com.aysekoc.questboard.dto.User.response.CreateUserResponseDto;
import com.aysekoc.questboard.entity.User;

import java.util.List;

public interface UserService {

    CreateUserResponseDto register(CreateUserRequestDto createUserDto);
    LoginUserResponseDto login(LoginUserRequestDto loginUserDto);
    List<User> listAll();
    User listUsername(String username);
    TaskStatusResponseDto getTaskStatusId(Long id);
    void delete(Long id);
}
