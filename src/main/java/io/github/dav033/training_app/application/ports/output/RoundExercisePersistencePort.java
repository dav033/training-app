package io.github.dav033.training_app.application.ports.output;

import io.github.dav033.training_app.domain.models.RoundExercise;

public interface RoundExercisePersistencePort {
    RoundExercise save(RoundExercise roundExercise);
}
