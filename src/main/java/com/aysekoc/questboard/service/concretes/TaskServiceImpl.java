package com.aysekoc.questboard.service.concretes;

import com.aysekoc.questboard.dto.Task.request.TaskCreateRequestDto;
import com.aysekoc.questboard.dto.Task.request.TaskUpdateRequestDto;
import com.aysekoc.questboard.dto.Task.response.TaskAllListResponseDto;
import com.aysekoc.questboard.dto.Task.response.TaskCreateResponseDto;
import com.aysekoc.questboard.dto.Task.response.TaskStatusListResponseDto;
import com.aysekoc.questboard.dto.Task.response.TaskTitleListResponseDto;
import com.aysekoc.questboard.entity.Task;
import com.aysekoc.questboard.repository.TaskRepository;
import com.aysekoc.questboard.service.abstracts.TaskService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class TaskServiceImpl implements TaskService {

    private TaskRepository taskRepository;

    @Override
    @Transactional
    public TaskCreateResponseDto addTask(TaskCreateRequestDto taskCreateRequestDto) {

        Task task = new Task();
        task.setTitle(taskCreateRequestDto.getTitle());
        task.setDescription(taskCreateRequestDto.getDescription());
        task.setDeadline(taskCreateRequestDto.getDeadline());
        task.setCategory(taskCreateRequestDto.getCategory());
        task.setStatus(taskCreateRequestDto.getStatus());

        taskRepository.save(task);

        TaskCreateResponseDto response = new TaskCreateResponseDto();
        response.setMessage("Task başarıyla oluşturuldu");
        response.setStatus(task.getStatus());
        response.setDeadline(task.getDeadline());

        return response;
    }

    @Override
    public void updateTask(Long taskId, TaskUpdateRequestDto taskUpdateDto) {
        Task task = taskRepository.findById(taskId).orElseThrow(() -> new RuntimeException("Task not found!"));

        task.setTitle(taskUpdateDto.getTitle());
        task.setDescription(taskUpdateDto.getDescription());
        task.setDeadline(taskUpdateDto.getDeadline());
        task.setCategory(taskUpdateDto.getCategory());
        task.setStatus(taskUpdateDto.getStatus());

        taskRepository.save(task);
    }

    @Override
    public List<TaskAllListResponseDto> listAll() {
      List<Task> liste =taskRepository.findAll();
      List <TaskAllListResponseDto> response = new ArrayList<>();
      for(int i =0;i<liste.size();i++){
          TaskAllListResponseDto response2 = new TaskAllListResponseDto();
          response2.setTitle(liste.get(i).getTitle());
          response2.setDescription(liste.get(i).getDescription());
          response2.setDeadline(liste.get(i).getDeadline());
          response2.setCategory(liste.get(i).getCategory());
          response2.setStatus(liste.get(i).getStatus());
          response.add(response2);
      }
      return response;
    }

    @Override
    public List<TaskTitleListResponseDto> findAllTitle() {
        List<Task> liste =taskRepository.findAllTitle();
        List <TaskTitleListResponseDto> response = new ArrayList<>();
        for(int i =0;i<liste.size();i++){
            TaskTitleListResponseDto response2 = new TaskTitleListResponseDto();
            response2.setId(liste.get(i).getId());
            response2.setTitle(liste.get(i).getTitle());
            response.add(response2);
        }
        return response;
    }
    @Override
    public List<TaskStatusListResponseDto> findAllStatus() {
        List<Task> liste =taskRepository.findAllStatus();
        List <TaskStatusListResponseDto> response = new ArrayList<>();
        for(int i =0;i<liste.size();i++){
            TaskStatusListResponseDto response2 = new TaskStatusListResponseDto();
            response2.setId(liste.get(i).getId());
            response2.setStatus(liste.get(i).getStatus().toString());
            response.add(response2);
        }
        return response;
    }
    @Override
    public void deleteTask(Long id) {
        taskRepository.deleteById(id);
        System.out.println(id+" başarıyla silindi! ");
    }
}
