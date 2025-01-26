package io.github.dav033.training_app.domain.models;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

public class Routine {
    private Long id;
    private Long trainingId;
    private String name;
    private String description;
    private BigDecimal price;
    private LocalDateTime createdAt;
    private List<Round> rounds;

    public Routine(Long id, Long trainingId, String name, String description, BigDecimal price, LocalDateTime createdAt, List<Round> rounds) {
        this.id = id;
        this.trainingId = trainingId;
        this.name = name;
        this.description = description;
        this.price = price;
        this.createdAt = createdAt;
        this.rounds = rounds;
    }

    public Routine(Long trainingId, String name, String description, BigDecimal price, List<Round> rounds) {
        this.trainingId = trainingId;
        this.name = name;
        this.description = description;
        this.price = price;
        this.rounds = rounds;
    }

    public Routine(String name, String description, BigDecimal price) {
        this.name = name;
        this.description = description;
        this.trainingId = trainingId;
        this.price = price;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getTrainingId() {
        return trainingId;
    }

    public void setTrainingId(Long trainingId) {
        this.trainingId = trainingId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public List<Round> getRounds() {
        return rounds;
    }

    public void setRounds(List<Round> rounds) {
        this.rounds = rounds;
    }

    public void addRound(Round round) {
        this.rounds.add(round);
    }

    public void removeRound(Round round) {
        this.rounds.remove(round);
    }

    public Routine() {
    }
}
