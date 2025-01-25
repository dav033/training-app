package io.github.dav033.training_app.application.ports.output;

import io.github.dav033.training_app.domain.models.TrainingTag;

public interface TrainingTagPersistencePort {
    TrainingTag save(TrainingTag trainingTag);
}
