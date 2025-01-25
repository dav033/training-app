package io.github.dav033.training_app.domain.ports.out;

import io.github.dav033.training_app.infrastructure.entities.UserEntity;

public interface TokenValidationPort {
    boolean isTokenValid(String token, UserEntity users);
}
