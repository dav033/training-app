package io.github.dav033.training_app.application.ports.output;

import io.github.dav033.training_app.domain.models.Exercise;

import java.util.List;
import java.util.Optional;

public interface ExercisePersistencePort {
    Exercise save(Exercise exercise);

    List<Exercise> findAll();

    Optional<Exercise> findById(Long id);

    void deleteById(Long id);
}
