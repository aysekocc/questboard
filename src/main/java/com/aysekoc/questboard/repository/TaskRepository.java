package com.aysekoc.questboard.repository;

import com.aysekoc.questboard.dto.Task.response.TaskAllListResponseDto;
import com.aysekoc.questboard.dto.Task.response.TaskStatusListResponseDto;
import com.aysekoc.questboard.dto.Task.response.TaskTitleListResponseDto;
import com.aysekoc.questboard.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {
    public List<TaskTitleListResponseDto> findAllTitle();
    public List<TaskStatusListResponseDto> findAllStatus();
}
