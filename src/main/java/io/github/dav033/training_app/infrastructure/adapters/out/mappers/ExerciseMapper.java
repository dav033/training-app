package io.github.dav033.training_app.infrastructure.adapters.out.mappers;

import io.github.dav033.training_app.domain.models.Exercise;
import io.github.dav033.training_app.infrastructure.entities.training.ExerciseEntity;
import org.springframework.stereotype.Component;

@Component
public class ExerciseMapper {

    public Exercise toDomain(ExerciseEntity entity) {
        if (entity == null) return null;
        return new Exercise(
                entity.getId(),
                entity.getName(),
                entity.getDescription(),
                entity.getCreatedAt()
        );
    }

    public ExerciseEntity toEntity(Exercise exercise) {
        if (exercise == null) return null;
        return new ExerciseEntity(
                exercise.getId(),
                exercise.getName(),
                exercise.getDescription(),
                exercise.getCreatedAt()
        );
    }
}
