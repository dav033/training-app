package io.github.dav033.training_app.infrastructure.entities.payment;


import io.github.dav033.training_app.domain.enums.AccessType;
import io.github.dav033.training_app.infrastructure.entities.training.RoutineEntity;
import io.github.dav033.training_app.infrastructure.entities.training.TrainingEntity;
import io.github.dav033.training_app.infrastructure.entities.UserEntity;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "user_access")
public class UserAccessEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private UserEntity user;

    @ManyToOne
    @JoinColumn(name = "training_id")
    private TrainingEntity training;

    @ManyToOne
    @JoinColumn(name = "routine_id")
    private RoutineEntity routine;

    @Column(name = "access_type", nullable = false)
    private String accessType;

    @Column(name = "start_date", nullable = false)
    private LocalDateTime startDate = LocalDateTime.now();

    @Column(name = "end_date")
    private LocalDateTime endDate;

    public UserAccessEntity(Long id, UserEntity userEntity, TrainingEntity trainingEntity, RoutineEntity routineEntity, AccessType accessType, LocalDateTime startDate, LocalDateTime endDate) {
    }

    public Long getId() {
        return id;
    }


    public void setId(Long id) {
        this.id = id;
    }

    public UserEntity getUser() {
        return user;
    }

    public void setUser(UserEntity user) {
        this.user = user;
    }

    public TrainingEntity getTraining() {
        return training;
    }

    public void setTraining(TrainingEntity training) {
        this.training = training;
    }

    public RoutineEntity getRoutine() {
        return routine;
    }

    public void setRoutine(RoutineEntity routine) {
        this.routine = routine;
    }

    public String getAccessType() {
        return accessType;
    }

    public void setAccessType(String accessType) {
        this.accessType = accessType;
    }

    public LocalDateTime getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDateTime startDate) {
        this.startDate = startDate;
    }

    public LocalDateTime getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDateTime endDate) {
        this.endDate = endDate;
    }

    public UserAccessEntity() {
    }

    public UserAccessEntity(UserEntity user, TrainingEntity training, RoutineEntity routine, String accessType, LocalDateTime startDate, LocalDateTime endDate) {
        this.user = user;
        this.training = training;
        this.routine = routine;
        this.accessType = accessType;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public UserAccessEntity(UserEntity user, String accessType, LocalDateTime startDate, LocalDateTime endDate) {
        this.user = user;
        this.accessType = accessType;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public UserAccessEntity(Long id, UserEntity user, TrainingEntity training, RoutineEntity routine, String accessType, LocalDateTime startDate, LocalDateTime endDate) {
        this.id = id;
        this.user = user;
        this.training = training;
        this.routine = routine;
        this.accessType = accessType;
        this.startDate = startDate;
        this.endDate = endDate;
    }


}
