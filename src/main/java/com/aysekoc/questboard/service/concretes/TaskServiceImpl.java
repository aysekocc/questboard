package com.aysekoc.questboard.service.concretes;

import com.aysekoc.questboard.repository.TaskRepository;
import com.aysekoc.questboard.service.abstracts.TaskService;
import org.springframework.stereotype.Service;

@Service
public class TaskServiceImpl implements TaskService {

    private TaskRepository taskRepository;
}
