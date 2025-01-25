package io.github.dav033.training_app.infrastructure.adapters.out;

import io.github.dav033.training_app.domain.enums.Role;
import io.github.dav033.training_app.infrastructure.entities.UserEntity;
import io.github.dav033.training_app.domain.ports.out.RolePort;
import io.github.dav033.training_app.infrastructure.repositories.UserRepository;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class GetRoleService implements RolePort {

    private final UserRepository userRepository;

    public GetRoleService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public Role getUserRole(UUID uuid) {

        final UserEntity user = userRepository.findByUuid(uuid).orElseThrow(() -> new IllegalArgumentException("User not found"));

        return user.getRole();
    }
}
