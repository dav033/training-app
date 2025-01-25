package io.github.dav033.training_app.infrastructure.repositories;

import io.github.dav033.training_app.infrastructure.entities.training.RoundTypeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoundTypeExercise extends JpaRepository<RoundTypeEntity, Long> {
}
