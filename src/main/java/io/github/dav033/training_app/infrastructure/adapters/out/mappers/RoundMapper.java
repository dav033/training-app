package io.github.dav033.training_app.infrastructure.adapters.out.mappers;

import io.github.dav033.training_app.domain.models.Round;
import io.github.dav033.training_app.infrastructure.entities.training.RoundEntity;
import io.github.dav033.training_app.infrastructure.entities.training.RoundExerciseEntity;
import io.github.dav033.training_app.infrastructure.entities.training.RoundTypeEntity;
import io.github.dav033.training_app.infrastructure.entities.training.RoutineEntity;
import io.github.dav033.training_app.infrastructure.repositories.RoundTypeRepository;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class RoundMapper {

    private final RoundTypeRepository roundTypeRepository;
    private final RoundTypeMapper roundTypeMapper;
    private final RoundExerciseMapper roundExerciseMapper;
    private final ExerciseMapper exerciseMapper;

    public RoundMapper(
            RoundTypeRepository roundTypeRepository,
            RoundTypeMapper roundTypeMapper,
            RoundExerciseMapper roundExerciseMapper,
            ExerciseMapper exerciseMapper
    ) {
        this.roundTypeRepository = roundTypeRepository;
        this.roundTypeMapper = roundTypeMapper;
        this.roundExerciseMapper = roundExerciseMapper;
        this.exerciseMapper = exerciseMapper;
    }

    /**
     * Convierte una entidad `RoundEntity` a un modelo de dominio `Round`
     */
    public Round toDomain(RoundEntity entity) {
        if (entity == null) return null;

        return new Round(
                entity.getId(),
                entity.getRest(),
                entity.getCreatedAt(),
                entity.getRoutine() != null ? entity.getRoutine().getId() : null,
                entity.getRoundType() != null ? entity.getRoundType().getId() : null,
                entity.getExercises().stream()
                        .map(roundExerciseMapper::toDomain)
                        .collect(Collectors.toList())
        );
    }

    /**
     * Convierte un modelo de dominio `Round` a una entidad `RoundEntity`
     */
    public RoundEntity toEntity(Round round, RoutineEntity routineEntity) {
        if (round == null) return null;

        RoundTypeEntity roundTypeEntity = round.getRoundTypeId() != null
                ? roundTypeRepository.findById(round.getRoundTypeId())
                .orElseThrow(() -> new RuntimeException("RoundType not found with ID: " + round.getRoundTypeId()))
                : null;

        RoundEntity roundEntity = new RoundEntity(
                round.getId(),
                routineEntity,
                roundTypeEntity,
                round.getRest(),
                round.getCreatedAt(),
                List.of()
        );

        List<RoundExerciseEntity> exerciseEntities = round.getExercises().stream()
                .map(exercise -> roundExerciseMapper.toEntity(
                        exercise,
                        roundEntity,
                        exerciseMapper.toEntity(exercise.getExercise())
                ))
                .collect(Collectors.toList());


        roundEntity.setExercises(exerciseEntities);

        return roundEntity;
    }
}
