package com.aysekoc.questboard.dto.Task.response;

import com.aysekoc.questboard.entity.TaskStatus;
import lombok.*;

import java.time.LocalDateTime;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TaskCreateResponseDto {
    private String message;
    private TaskStatus status;
    private LocalDateTime deadline;

}
