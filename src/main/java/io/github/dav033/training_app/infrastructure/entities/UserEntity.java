package io.github.dav033.training_app.infrastructure.entities;


import io.github.dav033.training_app.domain.enums.Role;
import io.github.dav033.training_app.infrastructure.entities.payment.PaymentEntity;
import io.github.dav033.training_app.infrastructure.entities.payment.SubscriptionEntity;
import io.github.dav033.training_app.infrastructure.entities.payment.UserAccessEntity;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "users", uniqueConstraints = {
        @UniqueConstraint(columnNames = "email")
})
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false)
    private Role role;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false)
    private UUID uuid;

    @Column(name = "created_at", nullable = false)
    private LocalDateTime createdAt = LocalDateTime.now();

    @OneToMany(mappedBy = "user")
    private List<PaymentEntity> payments;

    @OneToMany(mappedBy = "user")
    private List<SubscriptionEntity> subscriptions;

    @OneToMany(mappedBy = "user")
    private List<UserAccessEntity> userAccesses;

    //getter and setter

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public List<PaymentEntity> getPayments() {
        return payments;
    }

    public void setPayments(List<PaymentEntity> payments) {
        this.payments = payments;
    }

    public List<SubscriptionEntity> getSubscriptions() {
        return subscriptions;
    }

    public void setSubscriptions(List<SubscriptionEntity> subscriptions) {
        this.subscriptions = subscriptions;
    }

    public List<UserAccessEntity> getUserAccesses() {
        return userAccesses;
    }

    public void setUserAccesses(List<UserAccessEntity> userAccesses) {
        this.userAccesses = userAccesses;
    }
}
