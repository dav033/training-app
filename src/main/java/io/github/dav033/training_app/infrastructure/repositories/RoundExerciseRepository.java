package io.github.dav033.training_app.infrastructure.repositories;

import io.github.dav033.training_app.infrastructure.entities.training.RoundExerciseEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoundExerciseRepository extends JpaRepository<RoundExerciseEntity, Long> {
}
