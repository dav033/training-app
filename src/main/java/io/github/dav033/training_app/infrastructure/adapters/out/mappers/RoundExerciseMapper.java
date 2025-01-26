package io.github.dav033.training_app.infrastructure.adapters.out.mappers;

import io.github.dav033.training_app.domain.models.RoundExercise;
import io.github.dav033.training_app.infrastructure.entities.training.ExerciseEntity;
import io.github.dav033.training_app.infrastructure.entities.training.RoundEntity;
import io.github.dav033.training_app.infrastructure.entities.training.RoundExerciseEntity;
import org.springframework.stereotype.Component;

@Component
public class RoundExerciseMapper {

    private final ExerciseMapper exerciseMapper;

    public RoundExerciseMapper(ExerciseMapper exerciseMapper) {
        this.exerciseMapper = exerciseMapper;
    }

    public RoundExercise toDomain(RoundExerciseEntity entity) {
        if (entity == null) {
            return null;
        }
        return new RoundExercise(
                exerciseMapper.toDomain(entity.getExercise()),
                entity.getRepetitions(),
                entity.getPosition()
        );
    }

    public RoundExerciseEntity toEntity(RoundExercise roundExercise, RoundEntity roundEntity, ExerciseEntity exerciseEntity) {
        if (roundExercise == null) {
            return null;
        }
        return new RoundExerciseEntity(
                roundExercise.getId(),
                roundEntity,
                exerciseEntity,
                roundExercise.getRepetitions(),
                roundExercise.getPosition()
        );
    }
}
