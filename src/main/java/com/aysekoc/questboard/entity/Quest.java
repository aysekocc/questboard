package com.aysekoc.questboard.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;


@Entity
@Table(name = "quests")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Quest {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String title;

    @Column(columnDefinition = "TEXT")
    private String description;

    private String category;       // Örn: Coding, Fitness, Reading
    private Integer difficulty;    // 1–5 arası zorluk
    private Integer rewardPoints;  // Tamamlayınca verilen puan
    private Integer maxPlayers;    // opsiyonel, yarışma benzeri görevler için

    private LocalDateTime createdAt;
    private LocalDateTime deadline;

    @OneToMany(mappedBy = "quest", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<UserQuest> userQuests = new ArrayList<>();
}
