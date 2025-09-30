package com.aysekoc.questboard.service.abstracts;

import com.aysekoc.questboard.dto.Task.request.TaskCreateRequestDto;
import com.aysekoc.questboard.dto.Task.request.TaskUpdateRequestDto;
import com.aysekoc.questboard.dto.Task.response.TaskAllListResponseDto;
import com.aysekoc.questboard.dto.Task.response.TaskCreateResponseDto;
import com.aysekoc.questboard.dto.Task.response.TaskStatusListResponseDto;
import com.aysekoc.questboard.dto.Task.response.TaskTitleListResponseDto;

import java.util.List;

public interface TaskService {
    TaskCreateResponseDto addTask(TaskCreateRequestDto taskCreateRequestDto);
    void  updateTask(Long taskId, TaskUpdateRequestDto taskUpdateDto);
    List<TaskTitleListResponseDto> findAllTitle();
    List<TaskStatusListResponseDto> findAllStatus();
    void deleteTask(Long id);
    List<TaskAllListResponseDto> listAll();

}
