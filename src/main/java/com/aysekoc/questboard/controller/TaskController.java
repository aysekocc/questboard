package com.aysekoc.questboard.controller;


import com.aysekoc.questboard.dto.Task.request.TaskCreateRequestDto;
import com.aysekoc.questboard.dto.Task.request.TaskUpdateRequestDto;
import com.aysekoc.questboard.dto.Task.response.TaskAllListResponseDto;
import com.aysekoc.questboard.dto.Task.response.TaskCreateResponseDto;
import com.aysekoc.questboard.dto.Task.response.TaskStatusListResponseDto;
import com.aysekoc.questboard.dto.Task.response.TaskTitleListResponseDto;
import com.aysekoc.questboard.entity.User;
import com.aysekoc.questboard.service.abstracts.TaskService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tasks")
public class TaskController {

    private TaskService taskService;

    @PostMapping("/add")
    public TaskCreateResponseDto add(@RequestBody TaskCreateRequestDto taskCreateRequestDto) {
        return taskService.addTask(taskCreateRequestDto);
    }

    @PutMapping("/update")
    public void update(@RequestBody Long taskId, TaskUpdateRequestDto taskUpdateRequestDto){
        taskService.updateTask(taskId, taskUpdateRequestDto);
    }

    @GetMapping("/listAll")
    public List<TaskAllListResponseDto> listAll(){
        return taskService.listAll();
    }

    @GetMapping("/listTitle")
    public List<TaskTitleListResponseDto> listTitle(){
        return taskService.findAllTitle();
    }

    @GetMapping("/listTaskStatus")
    public List<TaskStatusListResponseDto> listTaskStatus(){
        return taskService.findAllStatus();
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        taskService.deleteTask(id);
    }
}
