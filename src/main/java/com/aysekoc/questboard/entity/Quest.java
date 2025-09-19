package com.aysekoc.questboard.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;


@Table(name="quests")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Quest {


    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="id", nullable=false, unique=true)
    private Long id;

    @Column(name="title")
    private String title;

    @Column(name="description")
    private String description;

   // enum String difficulty;

    @Column(name="reward_points")
    private int rewardPoints;

    @Column(name="created_at")
    private LocalDateTime createdAt;

    @Column(name="deadline")
    private LocalDateTime deadline;

    @ManyToMany
    @JoinTable(name="quest_user",
            joinColumns = @JoinColumn(name="quest_id"),
    inverseJoinColumns = @JoinColumn(name="user_id"))
    private List<User> user;
}
