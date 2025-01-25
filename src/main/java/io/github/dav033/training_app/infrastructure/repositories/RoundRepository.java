package io.github.dav033.training_app.infrastructure.repositories;

import io.github.dav033.training_app.infrastructure.entities.training.RoundEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoundRepository extends JpaRepository<RoundEntity, Long> {
}
