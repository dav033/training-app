package io.github.dav033.training_app.domain.models;

import io.github.dav033.training_app.domain.enums.SubscriptionStatus;

import java.time.LocalDateTime;

public class Subscription {
    private Long id;
    private User user; // Relación fuerte con el usuario
    private SubscriptionStatus status;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    private Payment payment;

    public Subscription() {
    }

    public Subscription(User user, SubscriptionStatus status, LocalDateTime startDate, LocalDateTime endDate, Payment payment) {
        this.user = user;
        this.status = status;
        this.startDate = startDate;
        this.endDate = endDate;
        this.payment = payment;
    }

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
}
