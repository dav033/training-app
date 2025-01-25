package io.github.dav033.training_app.domain.models;

public class RoutineTag {
    private Long id;
    private Long routineId;
    private Long tagId;

    public RoutineTag() {
    }

    public RoutineTag(Long id, Long routineId, Long tagId) {
        this.id = id;
        this.routineId = routineId;
        this.tagId = tagId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getRoutineId() {
        return routineId;
    }

    public void setRoutineId(Long routineId) {
        this.routineId = routineId;
    }

    public Long getTagId() {
        return tagId;
    }

    public void setTagId(Long tagId) {
        this.tagId = tagId;
    }
    
}
