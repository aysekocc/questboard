package com.aysekoc.questboard.dto.User.response;

import com.aysekoc.questboard.entity.Role;
import lombok.*;

import java.time.LocalDateTime;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserAllListResponseDto {
    private Long id;
    private String username;
    private String password;
    private LocalDateTime createdAt;
    private Role role;
}
