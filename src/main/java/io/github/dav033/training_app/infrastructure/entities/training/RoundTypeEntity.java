package io.github.dav033.training_app.infrastructure.entities.training;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "round_types")
public class RoundTypeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String name;

    @ManyToOne
    @JoinColumn(name = "routine_id", nullable = false)
    private RoutineEntity routine;

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

    public RoutineEntity getRoutine() {
        return routine;
    }

    public void setRoutine(RoutineEntity routine) {
        this.routine = routine;
    }

    //contructors

    public RoundTypeEntity() {
    }

    public RoundTypeEntity(Long id, String name) {
        this.id = id;
        this.name = name;
        this.routine = routine;
    }

    public RoundTypeEntity(String name, RoutineEntity routine) {
        this.name = name;
        this.routine = routine;
    }
}
