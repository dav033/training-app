package io.github.dav033.training_app.infrastructure.adapters.out;

import io.github.dav033.training_app.application.ports.output.UserPersistencePort;
import io.github.dav033.training_app.domain.models.User;
import io.github.dav033.training_app.infrastructure.adapters.out.mappers.UserMapper;
import io.github.dav033.training_app.infrastructure.repositories.UserRepository;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
public class UserPersistenceAdapter implements UserPersistencePort {
    private final UserRepository repository;
    private final UserMapper mapper;

    public UserPersistenceAdapter(UserRepository repository, UserMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Transactional
    @Override
    public User save(User user) {
        return mapper.toDomain(repository.save(mapper.toEntity(user)));
    }
}

