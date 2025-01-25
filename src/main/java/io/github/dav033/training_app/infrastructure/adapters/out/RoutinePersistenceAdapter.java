package io.github.dav033.training_app.infrastructure.adapters.out;


import io.github.dav033.training_app.application.ports.output.RoutinePersistencePort;
import io.github.dav033.training_app.domain.models.Routine;
import io.github.dav033.training_app.infrastructure.entities.training.RoutineEntity;
import io.github.dav033.training_app.infrastructure.repositories.RoutineRepository;
import io.github.dav033.training_app.infrastructure.repositories.TrainingRepository;
import org.springframework.stereotype.Component;

@Component
public class RoutinePersistenceAdapter implements RoutinePersistencePort {

    private final RoutineRepository repository;
    private final TrainingRepository trainingRepository;

    public RoutinePersistenceAdapter(RoutineRepository repository, TrainingRepository trainingRepository) {
        this.repository = repository;
    }

    @Override
    public Routine save(Routine routine) {

        RoutineEntity entity = new RoutineEntity(String routine.getName(), routine.getDescription(), routine.get);


    }
}
