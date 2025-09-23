package com.aysekoc.questboard.dto.Task.response;

import com.aysekoc.questboard.entity.TaskStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Data
@Getter
@Setter
@AllArgsConstructor
public class TaskCreateResponseDto {
    private String message;
    private TaskStatus status;
    private LocalDateTime deadline;
}
