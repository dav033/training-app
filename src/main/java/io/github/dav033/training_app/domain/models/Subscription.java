package io.github.dav033.training_app.domain.models;

import io.github.dav033.training_app.domain.enums.SubscriptionStatus;

import java.time.LocalDateTime;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Subscription {
    private Long id;
    private User user;
    private SubscriptionStatus status;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    private Payment payment;

    public Subscription(Long id, Long aLong, SubscriptionStatus status, LocalDateTime startDate, LocalDateTime endDate, Long aLong1) {
    }

    public Long getUserId() {
        return user != null ? user.getId() : null;
    }

    public Long getPaymentId() {
        return payment != null ? payment.getId() : null;
    }

}
