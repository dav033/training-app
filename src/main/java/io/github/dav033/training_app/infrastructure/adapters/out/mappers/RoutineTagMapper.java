package io.github.dav033.training_app.infrastructure.adapters.out.mappers;

import io.github.dav033.training_app.domain.models.RoutineTag;
import io.github.dav033.training_app.infrastructure.entities.training.RoutineEntity;
import io.github.dav033.training_app.infrastructure.entities.training.RoutineTagEntity;
import io.github.dav033.training_app.infrastructure.entities.training.TagEntity;
import org.springframework.stereotype.Component;

@Component
public class RoutineTagMapper {
    public RoutineTag toDomain(RoutineTagEntity entity) {
        if (entity == null) {
            return null;
        }
        return new RoutineTag(entity.getId(), entity.getRoutine().getId(), entity.getTag().getId());
    }

    public RoutineTagEntity toEntity(RoutineTag routineTag) {
        if (routineTag == null) {
            return null;
        }
        RoutineEntity routineEntity = new RoutineEntity();
        routineEntity.setId(routineTag.getRoutineId());

        TagEntity tagEntity = new TagEntity();
        tagEntity.setId(routineTag.getTagId());

        return new RoutineTagEntity(routineTag.getId(), routineEntity, tagEntity);
    }
}
