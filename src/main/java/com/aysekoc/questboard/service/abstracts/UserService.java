package com.aysekoc.questboard.service.abstracts;

import com.aysekoc.questboard.dto.User.CreateUserDto;

public interface UserService {
    String createUser(CreateUserDto createUserDto);

}
