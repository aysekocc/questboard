package com.aysekoc.questboard.service.concretes;


import com.aysekoc.questboard.dto.User.CreateUserDto;
import com.aysekoc.questboard.service.abstracts.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Override
    public String createUser(CreateUserDto createUserDto) {
        return "";
    }
}
