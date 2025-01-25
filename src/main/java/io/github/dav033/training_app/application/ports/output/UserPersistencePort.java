package io.github.dav033.training_app.application.ports.output;

import io.github.dav033.training_app.domain.models.User;

public interface UserPersistencePort {
    User save(User user);
}
