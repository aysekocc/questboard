package com.aysekoc.questboard.dto.User;

import jakarta.persistence.Column;

import java.time.LocalDateTime;

public class LoginUserResponseDto {

    private Long id;
    private String username;
    private String email;
    private String passwordHash;
    private String displayName;
    private String role;
    private Integer level;
    private Integer totalPoints;
    private LocalDateTime createdAt;

}
