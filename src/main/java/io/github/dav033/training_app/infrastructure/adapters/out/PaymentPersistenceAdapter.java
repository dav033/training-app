package io.github.dav033.training_app.infrastructure.adapters.out;


import io.github.dav033.training_app.application.ports.output.PaymentPersistencePort;
import io.github.dav033.training_app.domain.models.Payment;
import io.github.dav033.training_app.infrastructure.adapters.out.mappers.PaymentMapper;
import io.github.dav033.training_app.infrastructure.entities.UserEntity;
import io.github.dav033.training_app.infrastructure.entities.payment.PaymentEntity;
import io.github.dav033.training_app.infrastructure.repositories.PaymentRepository;
import io.github.dav033.training_app.infrastructure.repositories.UserRepository;
import org.springframework.stereotype.Component;

@Component
public class PaymentPersistenceAdapter implements PaymentPersistencePort {

    private final PaymentRepository paymentRepository;
    private final UserRepository userRepository;

    public PaymentPersistenceAdapter(PaymentRepository paymentRepository, UserRepository userRepository) {
        this.paymentRepository = paymentRepository;
        this.userRepository = userRepository;
    }

    @Override
    public Payment save(Payment payment) {
        // Convertir userId en UserEntity antes de guardar
        UserEntity userEntity = userRepository.findById(payment.getUserId())
                .orElseThrow(() -> new RuntimeException("User not found"));

        PaymentEntity paymentEntity = PaymentMapper.toEntity(payment, userEntity);
        PaymentEntity savedEntity = paymentRepository.save(paymentEntity);
        return PaymentMapper.toDomain(savedEntity);
    }


}
