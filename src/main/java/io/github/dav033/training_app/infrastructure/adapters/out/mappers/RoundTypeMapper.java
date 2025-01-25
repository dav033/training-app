package io.github.dav033.training_app.infrastructure.adapters.out.mappers;

import io.github.dav033.training_app.domain.models.RoundType;
import io.github.dav033.training_app.infrastructure.entities.training.RoundTypeEntity;
import org.springframework.stereotype.Component;

@Component
public class RoundTypeMapper {

    public RoundType toDomain(RoundTypeEntity entity) {
        if (entity == null) {
            return null;
        }
        return new RoundType(entity.getId(), entity.getName());
    }

    public RoundTypeEntity toEntity(RoundType roundType) {
        if (roundType == null) {
            return null;
        }
        return new RoundTypeEntity(roundType.getId(), roundType.getName());
    }
}