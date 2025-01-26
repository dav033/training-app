package io.github.dav033.training_app.domain.models;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

public class Training {
    private Long id;
    private String name;
    private String description;
    private BigDecimal price;
    private LocalDateTime createdAt;
    private List<Routine> routines;

    public Training(Long id, String name, String description, BigDecimal price, LocalDateTime createdAt, List<Routine> routines) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.createdAt = createdAt;
        this.routines = routines;
    }

    public Training(String name, String description, BigDecimal price, List<Routine> routines) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.routines = routines;
    }

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

    public List<Routine> getRoutines() {
        return routines;
    }

    public void setRoutines(List<Routine> routines) {
        this.routines = routines;
    }

    public Training(Long id, String name, String description, BigDecimal price, LocalDateTime createdAt) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.createdAt = createdAt;
    }

    public Training(String name, String description, BigDecimal price) {
        this.name = name;
        this.description = description;
        this.price = price;
    }

    public Training(String name, String description, BigDecimal price, LocalDateTime createdAt) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.createdAt = createdAt;
    }

    public Training() {
    }
}
