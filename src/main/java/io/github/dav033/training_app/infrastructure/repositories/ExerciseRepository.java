package io.github.dav033.training_app.infrastructure.repositories;

import io.github.dav033.training_app.infrastructure.entities.training.ExerciseEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExerciseRepository extends JpaRepository<ExerciseEntity, Long> {
}
