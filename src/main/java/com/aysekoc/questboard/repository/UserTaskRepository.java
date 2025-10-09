package com.aysekoc.questboard.repository;

import com.aysekoc.questboard.entity.UserTask;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserTaskRepository extends JpaRepository<UserTask,Long> {

    // user verip parametrede user  ıd  yazarsam o userdaki tasklar gelir
    List<UserTask> findByUserId(Long id);
    List<UserTask> findByTaskId(Long id);
}
