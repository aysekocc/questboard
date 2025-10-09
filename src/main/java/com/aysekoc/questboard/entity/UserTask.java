package com.aysekoc.questboard.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "user_tasks")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserTask {

    @Id
    Long UserId;
    Long TaskId;
}
