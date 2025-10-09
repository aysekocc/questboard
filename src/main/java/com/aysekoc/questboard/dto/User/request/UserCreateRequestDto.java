package com.aysekoc.questboard.dto.User.request;


import lombok.*;
import org.springframework.stereotype.Component;

import javax.management.relation.Role;

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
