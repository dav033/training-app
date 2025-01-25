package io.github.dav033.training_app.application.ports.input;

import io.github.dav033.training_app.application.ports.output.ExercisePersistencePort;
import io.github.dav033.training_app.domain.models.Exercise;
import org.springframework.stereotype.Component;

@Component
public class CreateExerciseUseCase {

    private final ExercisePersistencePort persistencePort;


    public CreateExerciseUseCase(ExercisePersistencePort persistencePort) {
        this.persistencePort = persistencePort;
    }

    public Exercise execute(Exercise exercise) {

        return persistencePort.save(exercise);
    }
}
