package io.github.dav033.training_app.application.ports.output;

import io.github.dav033.training_app.domain.models.Routine;

public interface RoutinePersistencePort {
    Routine save(Routine routine);
}
