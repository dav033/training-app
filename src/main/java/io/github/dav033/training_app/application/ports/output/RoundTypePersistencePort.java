package io.github.dav033.training_app.application.ports.output;

import io.github.dav033.training_app.domain.models.RoundType;

public interface RoundTypePersistencePort {
    RoundType save(RoundType roundType);
}
