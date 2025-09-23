package com.aysekoc.questboard.service.concretes;

import com.aysekoc.questboard.dto.Task.request.TaskCreateRequestDto;
import com.aysekoc.questboard.dto.Task.response.TaskAllListResponseDto;
import com.aysekoc.questboard.dto.Task.response.TaskStatusListResponseDto;
import com.aysekoc.questboard.dto.Task.response.TaskTitleListResponseDto;
import com.aysekoc.questboard.dto.Task.request.TaskUpdateRequestDto;
import com.aysekoc.questboard.entity.Task;
import com.aysekoc.questboard.repository.TaskRepository;
import com.aysekoc.questboard.service.abstracts.TaskService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskServiceImpl implements TaskService {

    private TaskRepository taskRepository;

    @Override
    public void addTask(TaskCreateRequestDto taskCreateRequestDto) {
        taskRepository.save(new Task(taskCreateRequestDto));

    }

    @Override
    public void updateTask(TaskUpdateRequestDto taskUpdateDto) {

    }

    @Override
    public List<TaskAllListResponseDto> findAll() {
        return List.of();
    }

    @Override
    public List<TaskTitleListResponseDto> findAllTitle() {
        return List.of();
    }

    @Override
    public List<TaskStatusListResponseDto> findAllStatus() {
        return List.of();
    }

    @Override
    public void deleteTask(Long id) {

    }
}
