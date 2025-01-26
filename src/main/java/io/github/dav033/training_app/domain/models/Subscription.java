package io.github.dav033.training_app.domain.models;

import io.github.dav033.training_app.domain.enums.SubscriptionStatus;

import java.time.LocalDateTime;

public class Subscription {
    private Long id;
    private User user;
    private SubscriptionStatus status;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    private Payment payment;


    public Subscription() {
    }

    // 🔹 Constructor principal con objetos completos
    public Subscription(Long id, User user, SubscriptionStatus status, LocalDateTime startDate, LocalDateTime endDate, Payment payment) {
        this.id = id;
        this.user = user;
        this.status = status;
        this.startDate = startDate;
        this.endDate = endDate;
        this.payment = payment;
    }

    // 🔹 Constructor con solo IDs para evitar carga innecesaria de entidades
    public Subscription(Long id, Long userId, SubscriptionStatus status, LocalDateTime startDate, LocalDateTime endDate, Long paymentId) {
        this.id = id;
        this.user = userId != null ? new User() : null;
        if (this.user != null) this.user.setId(userId);
        this.status = status;
        this.startDate = startDate;
        this.endDate = endDate;
        this.payment = paymentId != null ? new Payment() : null;
        if (this.payment != null) this.payment.setId(paymentId);
    }

    // 🔹 Getters y Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public SubscriptionStatus getStatus() {
        return status;
    }

    public void setStatus(SubscriptionStatus status) {
        this.status = status;
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

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    // 🔹 Métodos adicionales para obtener los IDs sin exponer las entidades
    public Long getUserId() {
        return user != null ? user.getId() : null;
    }

    public Long getPaymentId() {
        return payment != null ? payment.getId() : null;
    }
}
