package io.github.dav033.training_app.infrastructure.entities.training;


import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "training_tags")
public class TrainingTagEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "training_id", nullable = false)
    private TrainingEntity training;

    @ManyToOne
    @JoinColumn(name = "tag_id", nullable = false)
    private TagEntity tag;

    //getter and setter

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public TrainingEntity getTraining() {
        return training;
    }

    public void setTraining(TrainingEntity training) {
        this.training = training;
    }

    public TagEntity getTag() {
        return tag;
    }

    public void setTag(TagEntity tag) {
        this.tag = tag;
    }

    //Contructors

    public TrainingTagEntity() {
    }

    public TrainingTagEntity(Long id, TrainingEntity training, TagEntity tag) {
        this.id = id;
        this.training = training;
        this.tag = tag;
    }


}
