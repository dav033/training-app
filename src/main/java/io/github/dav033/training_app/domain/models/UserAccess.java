package io.github.dav033.training_app.domain.models;

import io.github.dav033.training_app.domain.enums.AccessType;

import java.time.LocalDateTime;

public class UserAccess {
    private Long id;
    private Long userId;
    private Long trainingId;
    private Long routineId;
    private AccessType accessType;
    private LocalDateTime startDate;
    private LocalDateTime endDate;

    public UserAccess() {
    }

    public UserAccess(Long id, Long userId, Long trainingId, Long routineId, AccessType accessType, LocalDateTime startDate, LocalDateTime endDate) {
        this.id = id;
        this.userId = userId;
        this.trainingId = trainingId;
        this.routineId = routineId;
        this.accessType = accessType;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getTrainingId() {
        return trainingId;
    }

    public void setTrainingId(Long trainingId) {
        this.trainingId = trainingId;
    }

    public Long getRoutineId() {
        return routineId;
    }

    public void setRoutineId(Long routineId) {
        this.routineId = routineId;
    }

    public AccessType getAccessType() {
        return accessType;
    }

    public void setAccessType(AccessType accessType) {
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
}
