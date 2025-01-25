package io.github.dav033.training_app.domain.models;

public class RoundType {
    private Long id;
    private String name;

    public RoundType() {
    }

    public RoundType(Long id, String name) {
        this.id = id;
        this.name = name;
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
}
