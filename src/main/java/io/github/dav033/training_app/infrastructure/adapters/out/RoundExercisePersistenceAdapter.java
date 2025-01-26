package io.github.dav033.training_app.infrastructure.adapters.out;

import io.github.dav033.training_app.application.ports.output.RoundExercisePersistencePort;
import io.github.dav033.training_app.domain.models.RoundExercise;
import io.github.dav033.training_app.infrastructure.adapters.out.mappers.RoundExerciseMapper;
import io.github.dav033.training_app.infrastructure.entities.training.RoundExerciseEntity;
import io.github.dav033.training_app.infrastructure.repositories.RoundExerciseRepository;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
public class RoundExercisePersistenceAdapter implements RoundExercisePersistencePort {
    private final RoundExerciseRepository repository;
    private final RoundExerciseMapper mapper;

    public RoundExercisePersistenceAdapter(RoundExerciseRepository repository, RoundExerciseMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Transactional
    @Override
    public RoundExercise save(RoundExercise roundExercise) {
        RoundExerciseEntity entity = mapper.toEntity(roundExercise, null, null);
        return mapper.toDomain(repository.save(entity));
    }
}
