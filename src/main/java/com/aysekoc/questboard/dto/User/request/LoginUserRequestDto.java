package com.aysekoc.questboard.dto.User.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
public class LoginUserRequestDto {

    private String username;
    private String password;
}
