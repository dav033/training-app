package io.github.dav033.training_app.infrastructure.adapters.out;


import io.github.dav033.training_app.application.ports.output.ExercisePersistencePort;
import io.github.dav033.training_app.domain.models.Exercise;
import io.github.dav033.training_app.infrastructure.adapters.out.mappers.ExerciseMapper;
import io.github.dav033.training_app.infrastructure.entities.training.ExerciseEntity;
import io.github.dav033.training_app.infrastructure.repositories.ExerciseRepository;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class ExercisePersistenceAdapter implements ExercisePersistencePort {

    private final ExerciseRepository repository;
    private final ExerciseMapper mapper;



    public ExercisePersistenceAdapter(ExerciseRepository repository, ExerciseMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public Exercise save(Exercise exercise) {
        ExerciseEntity entity = mapper.toEntity(exercise);
        ExerciseEntity savedEntity = repository.save(entity);
        return mapper.toDomain(savedEntity);
    }

    @Override
    public List<Exercise> findAll() {
        return repository.findAll().stream()
                .map(e -> new Exercise(
                        e.getId(),
                        e.getName(),
                        e.getDescription(),
                        e.getCreatedAt()
                ))
                .toList();
    }

    @Override
    public Optional<Exercise> findById(Long id) {
        return repository.findById(id).map(e -> new Exercise(e.getId(), e.getName(), e.getDescription(), e.getCreatedAt()));
    }

    @Override
    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}
