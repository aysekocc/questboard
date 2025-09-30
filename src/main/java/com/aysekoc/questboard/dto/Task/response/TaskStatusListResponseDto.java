package com.aysekoc.questboard.dto.Task.response;


import lombok.*;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TaskStatusListResponseDto {
    private Long id;
    private String status;
}
