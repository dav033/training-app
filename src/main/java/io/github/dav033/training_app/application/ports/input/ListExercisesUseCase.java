package io.github.dav033.training_app.application.ports.input;


import io.github.dav033.training_app.application.ports.output.ExercisePersistencePort;
import io.github.dav033.training_app.domain.models.Exercise;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ListExercisesUseCase {
    private final ExercisePersistencePort persistencePort;

    public ListExercisesUseCase(ExercisePersistencePort persistencePort) {
        this.persistencePort = persistencePort;
    }

    public List<Exercise> execute() {
        return persistencePort.findAll();
    }


}
