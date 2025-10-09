package com.aysekoc.questboard.repository;


import com.aysekoc.questboard.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {
    List<Task> findAllTitle();
    List<Task> findAllStatus();
    List<Task> findByUse(Long id);
}
