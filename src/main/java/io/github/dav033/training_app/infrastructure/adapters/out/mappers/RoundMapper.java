package io.github.dav033.training_app.infrastructure.adapters.out.mappers;

import io.github.dav033.training_app.domain.models.Round;
import io.github.dav033.training_app.infrastructure.entities.training.RoundEntity;
import io.github.dav033.training_app.infrastructure.entities.training.RoundTypeEntity;
import io.github.dav033.training_app.infrastructure.entities.training.RoutineEntity;
import org.springframework.stereotype.Component;

import java.util.stream.Collectors;

@Component
public class RoundMapper {

    private final RoundTypeMapper roundTypeMapper;

    public RoundMapper(RoundTypeMapper roundTypeMapper) {
        this.roundTypeMapper = roundTypeMapper;
    }

    public Round toDomain(RoundEntity entity) {
        return new Round(
                entity.getId(),
                entity.getRest(),
                entity.getCreatedAt(),
                RoutineMapper.toDomain(entity.getRoutine()),
                roundTypeMapper.toDomain(entity.getRoundType()), // Mapea RoundType
                entity.getExercises().stream().map(RoundExerciseMapper::toDomain).collect(Collectors.toList())
        );
    }

    public RoundEntity toEntity(Round round, RoutineEntity routineEntity) {
        return new RoundEntity(
                round.getId(),
                round.getRest(),
                round.getCreatedAt(),
                routineEntity,
                roundTypeMapper.toEntity(round.getRoundType()), // Mapea RoundType
                round.getExercises().stream().map(RoundExerciseMapper::toEntity).collect(Collectors.toList())
        );
    }
}