package io.github.dav033.training_app.application.ports.output;

import io.github.dav033.training_app.domain.models.Training;

public interface TrainingPersistencePort {
    Training save(Training training);
}
