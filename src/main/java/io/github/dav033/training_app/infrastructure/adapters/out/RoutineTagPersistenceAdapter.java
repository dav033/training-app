package io.github.dav033.training_app.infrastructure.adapters.out;


import io.github.dav033.training_app.application.ports.output.RoutineTagPersistencePort;
import io.github.dav033.training_app.domain.models.RoutineTag;
import io.github.dav033.training_app.infrastructure.adapters.out.mappers.RoutineTagMapper;
import io.github.dav033.training_app.infrastructure.repositories.RoutineTagRepository;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
public class RoutineTagPersistenceAdapter implements RoutineTagPersistencePort {
    private final RoutineTagRepository repository;
    private final RoutineTagMapper mapper;

    public RoutineTagPersistenceAdapter(RoutineTagRepository repository, RoutineTagMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Transactional
    @Override
    public RoutineTag save(RoutineTag routineTag) {
        return mapper.toDomain(repository.save(mapper.toEntity(routineTag)));
    }

}
