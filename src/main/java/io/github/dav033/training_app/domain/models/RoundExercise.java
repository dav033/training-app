package io.github.dav033.training_app.domain.models;

public class RoundExercise {
    private Long id;
    private Exercise exercise;
    private String repetitions;
    private Integer position;

    public RoundExercise() {
    }

    public RoundExercise(Exercise exercise, String repetitions, Integer position) {
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

    public Exercise getExercise() {
        return exercise;
    }

    public void setExercise(Exercise exercise) {
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
