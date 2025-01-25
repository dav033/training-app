package io.github.dav033.training_app.infrastructure.adapters.out;


import io.github.dav033.training_app.application.ports.output.ExercisePersistencePort;
import io.github.dav033.training_app.domain.models.Exercise;
import io.github.dav033.training_app.infrastructure.entities.training.ExerciseEntity;
import io.github.dav033.training_app.infrastructure.repositories.ExerciseRepository;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class ExercisePersistenceAdapter implements ExercisePersistencePort {

    private final ExerciseRepository repository;

    public ExercisePersistenceAdapter(ExerciseRepository repository) {
        this.repository = repository;
    }

    @Override
    public Exercise save(Exercise exercise) {
        ExerciseEntity entity = new ExerciseEntity(null, exercise.getName(), exercise.getDescription());
        ExerciseEntity savedEntity = repository.save(entity);
        return new Exercise(savedEntity.getId(), savedEntity.getName(), savedEntity.getDescription(), savedEntity.getCreatedAt());
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
