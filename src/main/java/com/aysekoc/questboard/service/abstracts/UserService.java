package com.aysekoc.questboard.service.abstracts;

import com.aysekoc.questboard.dto.Task.response.TaskCreateResponseDto;
import com.aysekoc.questboard.dto.User.request.UserCreateRequestDto;
import com.aysekoc.questboard.dto.User.request.UserLoginRequestDto;
import com.aysekoc.questboard.dto.User.response.UserLoginResponseDto;
import com.aysekoc.questboard.dto.User.response.UserCreateResponseDto;
import com.aysekoc.questboard.entity.User;

import java.util.List;

public interface UserService {

    UserCreateResponseDto register(UserCreateRequestDto createUserDto);
    UserLoginResponseDto login(UserLoginRequestDto loginUserDto);
    List<User> listAll();
    User listUsername(String username);
    TaskCreateResponseDto getTaskStatusId(Long id);
    void delete(Long id);
}
