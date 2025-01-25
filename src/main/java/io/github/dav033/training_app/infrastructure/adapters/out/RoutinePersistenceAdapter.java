package io.github.dav033.training_app.infrastructure.adapters.out;


import io.github.dav033.training_app.application.ports.output.RoutinePersistencePort;
import io.github.dav033.training_app.domain.models.Routine;
import io.github.dav033.training_app.infrastructure.adapters.out.mappers.RoutineMapper;
import io.github.dav033.training_app.infrastructure.entities.training.RoutineEntity;
import io.github.dav033.training_app.infrastructure.entities.training.TrainingEntity;
import io.github.dav033.training_app.infrastructure.repositories.RoutineRepository;
import io.github.dav033.training_app.infrastructure.repositories.TrainingRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class RoutinePersistenceAdapter implements RoutinePersistencePort {

    private final RoutineRepository repository;
    private final TrainingRepository trainingRepository;

    public RoutinePersistenceAdapter(RoutineRepository repository, TrainingRepository trainingRepository) {
        this.repository = repository;
        this.trainingRepository = trainingRepository;
    }

    @Override
    public Routine save(Routine routine) {
        TrainingEntity trainingEntity = routine.getTrainingId() != null
                ? trainingRepository.findById(routine.getTrainingId()).orElse(null)
                : null;

        RoutineEntity entity = new RoutineEntity(
                null,
                routine.getName(),
                routine.getDescription(),
                routine.getPrice(),
                routine.getCreatedAt(),
                null
        );
        RoutineEntity savedEntity = repository.save(entity);
        return new Routine(
                savedEntity.getId(),
                savedEntity.getTraining() != null ? savedEntity.getTraining().getId() : null,
                savedEntity.getName(),
                savedEntity.getDescription(),
                savedEntity.getPrice(),
                savedEntity.getCreatedAt(),
                List.of()
        );
    }
}
