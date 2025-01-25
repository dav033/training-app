package io.github.dav033.training_app.application.ports.output;

import io.github.dav033.training_app.domain.models.Tag;

public interface TagPersistencePort {
    Tag save(Tag tag);
}
