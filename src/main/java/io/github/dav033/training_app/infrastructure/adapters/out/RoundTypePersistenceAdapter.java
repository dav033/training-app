package io.github.dav033.training_app.infrastructure.adapters.out;

import io.github.dav033.training_app.application.ports.output.RoundTypePersistencePort;
import io.github.dav033.training_app.domain.models.RoundType;
import io.github.dav033.training_app.infrastructure.adapters.out.mappers.RoundTypeMapper;
import io.github.dav033.training_app.infrastructure.repositories.RoundTypeRepository;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
public class RoundTypePersistenceAdapter implements RoundTypePersistencePort {
    private final RoundTypeRepository repository;
    private final RoundTypeMapper mapper;

    public RoundTypePersistenceAdapter(RoundTypeRepository repository, RoundTypeMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Transactional
    @Override
    public RoundType save(RoundType roundType) {
        return mapper.toDomain(repository.save(mapper.toEntity(roundType)));
    }
}
