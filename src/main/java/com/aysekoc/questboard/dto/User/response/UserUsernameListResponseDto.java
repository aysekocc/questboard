package com.aysekoc.questboard.dto.User.response;

import com.aysekoc.questboard.entity.Role;
import lombok.*;

import java.time.LocalDateTime;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserUsernameListResponseDto {
    private LocalDateTime createdAt;
    private Role role;
}
