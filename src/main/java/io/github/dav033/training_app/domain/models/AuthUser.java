package io.github.dav033.training_app.domain.models;

import java.time.LocalDateTime;
import java.util.UUID;

public class AuthUser {
    private UUID id;
    private String email;
    private LocalDateTime createdAt;

    public AuthUser(UUID id, String email, LocalDateTime createdAt) {
        this.id = id;
        this.email = email;
        this.createdAt = createdAt;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public AuthUser() {
    }
}
