package com.aysekoc.questboard.service.abstracts;

import com.aysekoc.questboard.dto.Task.request.TaskCreateRequestDto;
import com.aysekoc.questboard.dto.Task.response.TaskAllListResponseDto;
import com.aysekoc.questboard.dto.Task.response.TaskStatusListResponseDto;
import com.aysekoc.questboard.dto.Task.response.TaskTitleListResponseDto;
import com.aysekoc.questboard.dto.Task.request.TaskUpdateRequestDto;

import java.util.List;

public interface TaskService {
    public void  addTask(TaskCreateRequestDto taskCreateRequestDto);
    public void  updateTask(TaskUpdateRequestDto taskUpdateDto);
    public List<TaskAllListResponseDto> findAll();
    public List<TaskTitleListResponseDto> findAllTitle();
    public List<TaskStatusListResponseDto> findAllStatus();
    public void deleteTask(Long id);

}
