package io.github.dav033.training_app.infrastructure.adapters.out;


import io.github.dav033.training_app.application.ports.output.SubscriptionPersistencePort;
import io.github.dav033.training_app.domain.models.Subscription;
import io.github.dav033.training_app.infrastructure.adapters.out.mappers.SubscriptionMapper;
import io.github.dav033.training_app.infrastructure.entities.UserEntity;
import io.github.dav033.training_app.infrastructure.entities.payment.PaymentEntity;
import io.github.dav033.training_app.infrastructure.repositories.PaymentRepository;
import io.github.dav033.training_app.infrastructure.repositories.SubscriptionRepository;
import io.github.dav033.training_app.infrastructure.repositories.UserRepository;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
public class SubscriptionPersistenceAdapter implements SubscriptionPersistencePort {
    private final SubscriptionRepository repository;
    private final SubscriptionMapper mapper;
    private final UserRepository userRepository;
    private final PaymentRepository paymentRepository;

    public SubscriptionPersistenceAdapter(
            SubscriptionRepository repository,
            SubscriptionMapper mapper,
            UserRepository userRepository,
            PaymentRepository paymentRepository) {
        this.repository = repository;
        this.mapper = mapper;
        this.userRepository = userRepository;
        this.paymentRepository = paymentRepository;
    }

    @Transactional
    @Override
    public Subscription save(Subscription subscription) {
        UserEntity userEntity = userRepository.findById(subscription.getUserId())
                .orElseThrow(() -> new RuntimeException("User not found"));

        PaymentEntity paymentEntity = subscription.getPaymentId() != null
                ? paymentRepository.findById(subscription.getPaymentId()).orElse(null)
                : null;

        return mapper.toDomain(repository.save(mapper.toEntity(subscription, userEntity, paymentEntity)));
    }
}


