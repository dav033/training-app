package io.github.dav033.training_app.infrastructure.adapters.out.mappers;

import io.github.dav033.training_app.domain.enums.SubscriptionStatus;
import io.github.dav033.training_app.domain.models.Subscription;
import io.github.dav033.training_app.infrastructure.entities.payment.SubscriptionEntity;
import io.github.dav033.training_app.infrastructure.entities.UserEntity;
import io.github.dav033.training_app.infrastructure.entities.payment.PaymentEntity;
import org.springframework.stereotype.Component;

@Component
public class SubscriptionMapper {

    public Subscription toDomain(SubscriptionEntity entity) {
        if (entity == null) {
            return null;
        }
        return new Subscription(
                entity.getId(),
                entity.getUser() != null ? entity.getUser().getId() : null,
                SubscriptionStatus.valueOf(entity.getStatus()),
                entity.getStartDate(),
                entity.getEndDate(),
                entity.getPayment() != null ? entity.getPayment().getId() : null
        );
    }

    public SubscriptionEntity toEntity(Subscription subscription, UserEntity userEntity, PaymentEntity paymentEntity) {
        if (subscription == null) {
            return null;
        }
        return
                new SubscriptionEntity(
                subscription.getId(),
                userEntity,
                subscription.getStatus(),
                subscription.getStartDate(),
                subscription.getEndDate(),
                paymentEntity
        );
    }
}
