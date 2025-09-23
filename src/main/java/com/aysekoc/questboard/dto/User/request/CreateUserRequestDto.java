package com.aysekoc.questboard.dto.User.request;


import com.aysekoc.questboard.entity.Difficulty;
import jakarta.persistence.Column;
import lombok.*;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Data
@Component
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CreateUserRequestDto {
    private String username;
    private String email;
    private String passwordHash;
    private String displayName;
    private String role;
    private Integer level;
    private Integer totalPoints;
    private Difficulty difficulty;
}
