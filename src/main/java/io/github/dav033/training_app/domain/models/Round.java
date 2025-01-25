package io.github.dav033.training_app.domain.models;

import java.time.LocalDateTime;
import java.util.List;

public class Round {

    private Long id;
    private Integer rest;
    private LocalDateTime createdAt;
    private Long routineId;
    private Long roundTypeId;
    private List<RoundExercise> exercises;

    public Round(Long id, Integer rest, LocalDateTime createdAt, Long routineId, Long roundTypeId, List<RoundExercise> exercises) {
        this.id = id;
        this.rest = rest;
        this.createdAt = createdAt;
        this.routineId = routineId;
        this.roundTypeId = roundTypeId;
        this.exercises = exercises;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getRest() {
        return rest;
    }

    public void setRest(Integer rest) {
        this.rest = rest;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public Long getRoutineId() {
        return routineId;
    }

    public void setRoutineId(Long routineId) {
        this.routineId = routineId;
    }

    public Long getRoundTypeId() {
        return roundTypeId;
    }

    public void setRoundTypeId(Long roundTypeId) {
        this.roundTypeId = roundTypeId;
    }

    public List<RoundExercise> getExercises() {
        return exercises;
    }

    public void setExercises(List<RoundExercise> exercises) {
        this.exercises = exercises;
    }


}
