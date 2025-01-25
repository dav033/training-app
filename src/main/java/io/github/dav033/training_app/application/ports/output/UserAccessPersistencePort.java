package io.github.dav033.training_app.application.ports.output;

import io.github.dav033.training_app.domain.models.UserAccess;

public interface UserAccessPersistencePort {
    UserAccess save(UserAccess userAccess);
}
