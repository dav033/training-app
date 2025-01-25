package io.github.dav033.training_app.application.ports.output;

import io.github.dav033.training_app.domain.models.Payment;

public interface PaymentPersistencePort {
    Payment save(Payment payment);
}
