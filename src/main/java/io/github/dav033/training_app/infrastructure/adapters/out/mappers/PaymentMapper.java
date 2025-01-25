package io.github.dav033.training_app.infrastructure.adapters.out.mappers;

import io.github.dav033.training_app.domain.models.Payment;
import io.github.dav033.training_app.infrastructure.entities.UserEntity;
import io.github.dav033.training_app.infrastructure.entities.payment.PaymentEntity;

public class PaymentMapper {
    public static Payment toDomain(PaymentEntity entity) {
        return new Payment(
                entity.getId(),
                entity.getUser().getId(), // Convertir UserEntity a userId
                entity.getAmount(),
                entity.getStatus(),
                entity.getMethod(),
                entity.getMethodDetails(),
                entity.getCreatedAt()
        );
    }

    public static PaymentEntity toEntity(Payment payment, UserEntity userEntity) {
        return new PaymentEntity(
                payment.getId(),
                userEntity, // Convertir userId a UserEntity
                payment.getAmount(),
                payment.getStatus(),
                payment.getMethod(),
                payment.getMethodDetails(),
                payment.getCreatedAt()
        );
    }
}
