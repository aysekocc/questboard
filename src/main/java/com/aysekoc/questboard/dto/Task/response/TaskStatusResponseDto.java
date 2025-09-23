package com.aysekoc.questboard.dto.Task.response;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Data
@Getter
@Setter
@AllArgsConstructor
public class TaskStatusResponseDto {
    private String title;
    private String description;
    private String category;
    private int difficulty;
    private int rewardPoints;
    private int maxPlayers;
    private LocalDateTime createdAt;
    private LocalDateTime deadline;
}
