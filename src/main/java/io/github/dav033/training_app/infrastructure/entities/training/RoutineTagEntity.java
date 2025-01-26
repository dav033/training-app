package io.github.dav033.training_app.infrastructure.entities.training;


import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "routine_tags")
public class RoutineTagEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "routine_id", nullable = false)
    private RoutineEntity routine;

    @ManyToOne
    @JoinColumn(name = "tag_id", nullable = false)
    private TagEntity tag;


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

    public TagEntity getTag() {
        return tag;
    }

    public void setTag(TagEntity tag) {
        this.tag = tag;
    }


    public RoutineTagEntity() {
    }

    public RoutineTagEntity(Long id, RoutineEntity routine, TagEntity tag) {
        this.id = id;
        this.routine = routine;
        this.tag = tag;
    }


}
