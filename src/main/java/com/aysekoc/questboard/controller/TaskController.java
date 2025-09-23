package com.aysekoc.questboard.controller;


import com.aysekoc.questboard.service.abstracts.TaskService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/tasks")
public class TaskController {

    private TaskService taskService;
}
