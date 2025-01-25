package io.github.dav033.training_app.domain.models;

import io.github.dav033.training_app.domain.enums.PaymentMethod;
import io.github.dav033.training_app.domain.enums.PaymentStatus;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Payment {
    private Long id;
    private Long userId;
    private BigDecimal amount;
    private PaymentStatus status;
    private PaymentMethod method;
    private String methodDetails;
    private LocalDateTime createdAt;

    public Payment(Long id, Long userId, BigDecimal amount, PaymentStatus status, PaymentMethod method, String methodDetails, LocalDateTime createdAt) {
        this.id = id;
        this.userId = userId;
        this.amount = amount;
        this.status = status;
        this.method = method;
        this.methodDetails = methodDetails;
        this.createdAt = createdAt;
    }

    public Payment(Long userId, BigDecimal amount, PaymentStatus status, PaymentMethod method, String methodDetails) {
        this.userId = userId;
        this.amount = amount;
        this.status = status;
        this.method = method;
        this.methodDetails = methodDetails;
        this.createdAt = LocalDateTime.now(); // Valor por defecto
    }

    public Long getId() {
        return id;
    }

    public Long getUserId() {
        return userId;
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