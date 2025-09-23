package com.aysekoc.questboard.dto.Task.response;

import com.aysekoc.questboard.entity.Category;
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
public class TaskAllListResponseDto {
    private String title;
    private String description;
    private LocalDateTime deadline;
    private Category category;
    private TaskStatus status;

}
