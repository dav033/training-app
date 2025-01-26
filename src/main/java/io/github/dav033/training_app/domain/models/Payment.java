package io.github.dav033.training_app.domain.models;

import io.github.dav033.training_app.domain.enums.PaymentMethod;
import io.github.dav033.training_app.domain.enums.PaymentStatus;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Payment {
    private Long id;
    private Long userId;
    private BigDecimal amount;
    private PaymentStatus status;
    private PaymentMethod method;
    private String methodDetails;
    private LocalDateTime createdAt;
}