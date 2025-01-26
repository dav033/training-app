package io.github.dav033.training_app.infrastructure.entities.payment;


import io.github.dav033.training_app.domain.enums.PaymentMethod;
import io.github.dav033.training_app.domain.enums.PaymentStatus;
import io.github.dav033.training_app.infrastructure.entities.UserEntity;
import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@Entity
@Table(name = "payments")
@NoArgsConstructor
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

}
