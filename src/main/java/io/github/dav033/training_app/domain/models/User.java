package io.github.dav033.training_app.domain.models;

import io.github.dav033.training_app.domain.enums.Role;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

public class User {
    private Long id;
    private UUID uid;
    private Role role;
    private String email;
    private LocalDateTime createdAt;
    private List<Payment> payments; // Relación fuerte

    public User(Long id, UUID uid, Role role, String email, LocalDateTime createdAt, List<Payment> payments) {
        this.id = id;
        this.uid = uid;
        this.role = role;
        this.email = email;
        this.createdAt = createdAt;
        this.payments = payments;
    }

    public User(UUID uid, Role role, String email, List<Payment> payments) {
        this.uid = uid;
        this.role = role;
        this.email = email;
        this.payments = payments;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public UUID getUid() {
        return uid;
    }

    public void setUid(UUID uid) {
        this.uid = uid;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
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

    public List<Payment> getPayments() {
        return payments;
    }

    public void setPayments(List<Payment> payments) {
        this.payments = payments;
    }

    public User() {
    }

    public User(UUID uid, Role role, String email) {
        this.uid = uid;
        this.role = role;
        this.email = email;
    }

    public User(UUID uid, Role role, String email, LocalDateTime createdAt) {
        this.uid = uid;
        this.role = role;
        this.email = email;
        this.createdAt = createdAt;
    }

    public User(Long id, UUID uid, Role role, String email, LocalDateTime createdAt) {
        this.id = id;
        this.uid = uid;
        this.role = role;
        this.email = email;
        this.createdAt = createdAt;
    }

    public User(UUID uid, Role role, String email, LocalDateTime createdAt, List<Payment> payments) {
        this.uid = uid;
        this.role = role;
        this.email = email;
        this.createdAt = createdAt;
        this.payments = payments;
    }

    public User(Long id, UUID uid, Role role, String email) {
        this.id = id;
        this.uid = uid;
        this.role = role;
        this.email = email;
    }

    public User(Long id, UUID uid, Role role, String email, List<Payment> payments) {
        this.id = id;
        this.uid = uid;
        this.role = role;
        this.email = email;
        this.payments = payments;
    }


}
