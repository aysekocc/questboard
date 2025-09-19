package com.aysekoc.questboard.dto.User;


import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class CreateUserDto {
    private String username;
    private String email;
    private String password;

}
