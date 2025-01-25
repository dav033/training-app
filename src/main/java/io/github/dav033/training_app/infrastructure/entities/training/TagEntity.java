package io.github.dav033.training_app.infrastructure.entities.training;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "tags")
public class TagEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String name;

    @Column(name = "created_at", nullable = false)
    private LocalDateTime createdAt = LocalDateTime.now();

    @OneToMany(mappedBy = "tag")
    private List<TrainingTagEntity> trainingTags;

    @OneToMany(mappedBy = "tag")
    private List<RoutineTagEntity> routineTags;

    //getter and setter

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public List<TrainingTagEntity> getTrainingTags() {
        return trainingTags;
    }

    public void setTrainingTags(List<TrainingTagEntity> trainingTags) {
        this.trainingTags = trainingTags;
    }

    public List<RoutineTagEntity> getRoutineTags() {
        return routineTags;
    }

    public void setRoutineTags(List<RoutineTagEntity> routineTags) {
        this.routineTags = routineTags;
    }

    public TagEntity() {
    }

    public TagEntity(String name) {
        this.name = name;
    }

    public TagEntity(Long id, String name, LocalDateTime createdAt) {
        this.id = id;
        this.name = name;
        this.createdAt = createdAt;
    }

    public TagEntity(String name, LocalDateTime createdAt) {
        this.name = name;
        this.createdAt = createdAt;
    }

    public TagEntity(Long id, String name) {
        this.id = id;
        this.name = name;
    }

}
