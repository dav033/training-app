package io.github.dav033.training_app.infrastructure.entities.training;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "rounds")
public class RoundEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "routine_id", nullable = false)
    private RoutineEntity routine;

    @ManyToOne
    @JoinColumn(name = "round_type_id")
    private RoundTypeEntity roundType;

    private Integer rest;

    @Column(name = "created_at", nullable = false)
    private LocalDateTime createdAt = LocalDateTime.now();

    @OneToMany(mappedBy = "round", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<RoundExerciseEntity> exercises;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public RoutineEntity getRoutine() {
        return routine;
    }

    public void setRoutine(RoutineEntity routine) {
        this.routine = routine;
    }

    public RoundTypeEntity getRoundType() {
        return roundType;
    }

    public void setRoundType(RoundTypeEntity roundType) {
        this.roundType = roundType;
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

    public List<RoundExerciseEntity> getExercises() {
        return exercises;
    }

    public void setExercises(List<RoundExerciseEntity> exercises) {
        this.exercises = exercises;
    }

    public RoundEntity() {
    }

    public RoundEntity(Long id, RoutineEntity routine, RoundTypeEntity roundType, Integer rest, LocalDateTime createdAt, List<RoundExerciseEntity> exercises) {
        this.id = id;
        this.routine = routine;
        this.roundType = roundType;
        this.rest = rest;
        this.createdAt = createdAt;
        this.exercises = exercises;
    }

    public RoundEntity(RoutineEntity routine, RoundTypeEntity roundType, Integer rest, List<RoundExerciseEntity> exercises) {
        this.routine = routine;
        this.roundType = roundType;
        this.rest = rest;
        this.exercises = exercises;
    }


}
