package com.aysekoc.questboard.dto.Task.response;

import com.aysekoc.questboard.entity.Category;
import com.aysekoc.questboard.entity.TaskStatus;
import lombok.*;

import java.time.LocalDateTime;



@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TaskAllListResponseDto {
    private String title;
    private String description;
    private LocalDateTime deadline;
    private Category category;
    private TaskStatus status;

}
