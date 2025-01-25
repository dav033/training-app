package io.github.dav033.training_app.infrastructure.entities.payment;


import io.github.dav033.training_app.domain.enums.PaymentMethod;
import io.github.dav033.training_app.domain.enums.PaymentStatus;
import io.github.dav033.training_app.infrastructure.entities.UserEntity;
import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "payments")
public class PaymentEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private UserEntity user;

    @Column(nullable = false)
    private BigDecimal amount;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private PaymentStatus status;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private PaymentMethod method;

    @Column(name = "method_details", columnDefinition = "jsonb")
    private String methodDetails;

    @Column(name = "created_at", nullable = false)
    private LocalDateTime createdAt = LocalDateTime.now();

    public PaymentEntity() {
    }

    public PaymentEntity(UserEntity user, BigDecimal amount, PaymentStatus status, PaymentMethod method, String methodDetails) {
        this.user = user;
        this.amount = amount;
        this.status = status;
        this.method = method;
        this.methodDetails = methodDetails;
        this.createdAt = LocalDateTime.now(); // Valor por defecto
    }

    public PaymentEntity(Long id, UserEntity user, BigDecimal amount, PaymentStatus status, PaymentMethod method, String methodDetails, LocalDateTime createdAt) {
        this.id = id;
        this.user = user;
        this.amount = amount;
        this.status = status;
        this.method = method;
        this.methodDetails = methodDetails;
        this.createdAt = createdAt;
    }

    public Long getId() {
        return id;
    }

    public UserEntity getUser() {
        return user;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public PaymentStatus getStatus() {
        return status;
    }

    public PaymentMethod getMethod() {
        return method;
    }

    public String getMethodDetails() {
        return methodDetails;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }
}
