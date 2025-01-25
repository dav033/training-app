package io.github.dav033.training_app.infrastructure.adapters.out.mappers;

import io.github.dav033.training_app.domain.models.Training;
import io.github.dav033.training_app.infrastructure.entities.training.TrainingEntity;
import org.springframework.stereotype.Component;

@Component
public class TrainingMapper {

    public Training toDomain(TrainingEntity entity) {
        if (entity == null) {
            return null;
        }
        return new Training(
                entity.getId(),
                entity.getName(),
                entity.getDescription(),
                entity.getPrice(),
                entity.getCreatedAt(),
                null // La lista de routines se maneja en otro mapper
        );
    }

    public TrainingEntity toEntity(Training training) {
        if (training == null) {
            return null;
        }
        return new TrainingEntity(
                training.getName(),
                training.getDescription(),
                training.getPrice()
        );
    }
}
