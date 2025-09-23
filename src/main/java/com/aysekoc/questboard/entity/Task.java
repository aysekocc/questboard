package com.aysekoc.questboard.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;


@Entity
@Table(name = "tasks")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="title", nullable = false, unique = true)
    private String title;

    @Column(name="description", columnDefinition = "TEXT")
    private String description;

    @Column(name="category")
    private String category;

    @Column(name="difficulty")
    private int difficulty;

    @Column(name="reward_points")
    private int rewardPoints;

    @Column(name="max_players")
    private int maxPlayers;

    @Column(name="created_at")
    private LocalDateTime createdAt;

    @Column(name="deadline")
    private LocalDateTime deadline;

    @ManyToMany(mappedBy = "userTask", fetch =  FetchType.LAZY)
    private Set<User> users = new HashSet<>();

}
