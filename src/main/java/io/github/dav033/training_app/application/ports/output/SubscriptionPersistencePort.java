package io.github.dav033.training_app.application.ports.output;

import io.github.dav033.training_app.domain.models.Subscription;

public interface SubscriptionPersistencePort {
    Subscription save(Subscription subscription);
}
