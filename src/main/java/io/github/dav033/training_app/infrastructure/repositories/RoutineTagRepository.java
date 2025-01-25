package io.github.dav033.training_app.infrastructure.repositories;

import io.github.dav033.training_app.infrastructure.entities.training.RoutineTagEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoutineTagRepository extends JpaRepository<RoutineTagEntity, Long> {
}
