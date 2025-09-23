package com.aysekoc.questboard.dto.User.request;


import com.aysekoc.questboard.entity.Role;
import lombok.*;
import org.springframework.stereotype.Component;

@Data
@Component
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserCreateRequestDto {
    private String username;
    private String password;
    private Role role;
}
