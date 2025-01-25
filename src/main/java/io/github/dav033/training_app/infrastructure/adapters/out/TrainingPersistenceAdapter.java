package io.github.dav033.training_app.infrastructure.adapters.out;


import io.github.dav033.training_app.application.ports.output.TrainingPersistencePort;
import io.github.dav033.training_app.domain.models.Training;
import io.github.dav033.training_app.infrastructure.entities.training.TrainingEntity;
import io.github.dav033.training_app.infrastructure.repositories.TrainingRepository;
import org.springframework.stereotype.Component;

@Component
public class TrainingPersistenceAdapter implements TrainingPersistencePort {

    private final TrainingRepository trainingRepository;

    public TrainingPersistenceAdapter(TrainingRepository trainingRepository) {
        this.trainingRepository = trainingRepository;
    }


    @Override
    public Training save(Training training) {
        TrainingEntity entity = new TrainingEntity(training.getName(), training.getDescription(), training.getPrice());
        TrainingEntity savedEntity = trainingRepository.save(entity);
        return new Training(savedEntity.getId(), savedEntity.getName(), savedEntity.getDescription(), savedEntity.getPrice(), savedEntity.getCreatedAt());
    }
}
