package io.github.dav033.training_app.domain.models;

public class TrainingTag {
    private Long id;
    private Long trainingId;
    private Long tagId;

    public TrainingTag() {
    }

    public TrainingTag(Long id, Long trainingId, Long tagId) {
        this.id = id;
        this.trainingId = trainingId;
        this.tagId = tagId;
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

    public Long getTagId() {
        return tagId;
    }

    public void setTagId(Long tagId) {
        this.tagId = tagId;
    }
}
