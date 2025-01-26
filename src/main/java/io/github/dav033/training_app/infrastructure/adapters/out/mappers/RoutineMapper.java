package io.github.dav033.training_app.infrastructure.adapters.out.mappers;

import io.github.dav033.training_app.domain.models.Routine;
import io.github.dav033.training_app.infrastructure.entities.training.RoutineEntity;
import io.github.dav033.training_app.infrastructure.entities.training.TrainingEntity;
import org.springframework.stereotype.Component;

@Component
public class RoutineMapper {

    public static Routine toDomain(RoutineEntity entity) {
        return new Routine(
                entity.getId(),
                entity.getTraining() != null ? entity.getTraining().getId() : null,
                entity.getName(),
                entity.getDescription(),
                entity.getPrice(),
                entity.getCreatedAt(),
                null
        );
    }

    public static RoutineEntity toEntity(Routine routine, TrainingEntity trainingEntity) {
        return new RoutineEntity(
                routine.getId(),
                routine.getName(),
                routine.getDescription(),
                routine.getPrice(),
                routine.getCreatedAt(),
                trainingEntity
        );
    }
}