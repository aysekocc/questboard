package com.aysekoc.questboard.dto.Task.response;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
@AllArgsConstructor
public class TaskStatusListResponseDto {
    private Long id;
    private String status;
}
