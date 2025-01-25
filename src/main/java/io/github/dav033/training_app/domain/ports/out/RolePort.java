package io.github.dav033.training_app.domain.ports.out;

import io.github.dav033.training_app.domain.enums.Role;

import java.util.UUID;

public interface RolePort {
    Role getUserRole(UUID uuid);
}
