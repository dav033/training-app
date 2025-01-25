package io.github.dav033.training_app.infrastructure.repositories;

import io.github.dav033.training_app.infrastructure.entities.training.TagEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TagRepository extends JpaRepository<TagEntity, Long> {
}
