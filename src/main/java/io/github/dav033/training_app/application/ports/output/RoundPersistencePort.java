package io.github.dav033.training_app.application.ports.output;

import io.github.dav033.training_app.domain.models.Round;

public interface RoundPersistencePort {
    Round save(Round round);
}
