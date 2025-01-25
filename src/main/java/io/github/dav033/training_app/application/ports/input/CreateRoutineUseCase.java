package io.github.dav033.training_app.application.ports.input;


import io.github.dav033.training_app.application.ports.output.RoutinePersistencePort;
import io.github.dav033.training_app.application.ports.output.TrainingPersistencePort;
import io.github.dav033.training_app.domain.models.Routine;
import org.springframework.stereotype.Component;

@Component
public class CreateRoutineUseCase {

    private final RoutinePersistencePort persistencePort;

    public CreateRoutineUseCase(RoutinePersistencePort persistencePort) {
        this.persistencePort = persistencePort;
    }

    public Routine execute(Routine routine) {

        System.out.println("CreateRoutineUseCase.execute() routine: " + routine);
        return persistencePort.save(routine);
    }
}
