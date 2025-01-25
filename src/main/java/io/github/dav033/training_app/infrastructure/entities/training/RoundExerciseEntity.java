package io.github.dav033.training_app.infrastructure.entities.training;

import jakarta.persistence.*;
import lombok.*;


@Entity
@Table(name = "round_exercises")
public class RoundExerciseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "round_id", nullable = false)
    private RoundEntity round;

    @ManyToOne
    @JoinColumn(name = "exercise_id", nullable = false)
    private ExerciseEntity exercise;

    @Column(nullable = false)
    private String repetitions;

    @Column(nullable = false)
    private Integer position;

    public RoundExerciseEntity() {
    }

    public RoundExerciseEntity(RoundEntity round, ExerciseEntity exercise, String repetitions, Integer position) {
        this.round = round;
        this.exercise = exercise;
        this.repetitions = repetitions;
        this.position = position;
    }

    public RoundExerciseEntity(Long id, RoundEntity round, ExerciseEntity exercise, String repetitions, Integer position) {
        this.id = id;
        this.round = round;
        this.exercise = exercise;
        this.repetitions = repetitions;
        this.position = position;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public RoundEntity getRound() {
        return round;
    }

    public void setRound(RoundEntity round) {
        this.round = round;
    }

    public ExerciseEntity getExercise() {
        return exercise;
    }

    public void setExercise(ExerciseEntity exercise) {
        this.exercise = exercise;
    }

    public String getRepetitions() {
        return repetitions;
    }

    public void setRepetitions(String repetitions) {
        this.repetitions = repetitions;
    }

    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }
}
