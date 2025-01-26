package io.github.dav033.training_app.infrastructure.adapters.out;

import io.github.dav033.training_app.application.ports.output.RoundPersistencePort;
import io.github.dav033.training_app.domain.models.Round;
import io.github.dav033.training_app.infrastructure.adapters.out.mappers.RoundMapper;
import io.github.dav033.training_app.infrastructure.repositories.RoundRepository;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
public class RoundPersistenceAdapter implements RoundPersistencePort {
    private final RoundRepository repository;
    private final RoundMapper mapper;

    public RoundPersistenceAdapter(RoundRepository repository, RoundMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Transactional
    @Override
    public Round save(Round round) {
        return mapper.toDomain(repository.save(mapper.toEntity(round, null)));
    }
}

