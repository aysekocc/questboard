package com.aysekoc.questboard.repository;

import com.aysekoc.questboard.entity.Task;
import com.aysekoc.questboard.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    List<User> findAllUsername();
    List<Task> findAllTask();
}
