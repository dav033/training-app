package io.github.dav033.training_app.infrastructure.adapters.out.mappers;

import io.github.dav033.training_app.domain.models.UserAccess;
import io.github.dav033.training_app.infrastructure.entities.payment.UserAccessEntity;
import io.github.dav033.training_app.infrastructure.entities.UserEntity;
import io.github.dav033.training_app.infrastructure.entities.training.RoutineEntity;
import io.github.dav033.training_app.infrastructure.entities.training.TrainingEntity;
import org.springframework.stereotype.Component;

@Component
public class UserAccessMapper {

    public UserAccess toDomain(UserAccessEntity entity) {
        if (entity == null) {
            return null;
        }
        return new UserAccess(
                entity.getId(),
                entity.getUser() != null ? entity.getUser().getId() : null,
                entity.getTraining() != null ? entity.getTraining().getId() : null,
                entity.getRoutine() != null ? entity.getRoutine().getId() : null,
                entity.getAccessType(),
                entity.getStartDate(),
                entity.getEndDate()
        );
    }

    public UserAccessEntity toEntity(UserAccess userAccess, UserEntity userEntity, TrainingEntity trainingEntity, RoutineEntity routineEntity) {
        if (userAccess == null || userEntity == null) {
            throw new IllegalArgumentException("UserAccess and UserEntity cannot be null");
        }

        if (trainingEntity == null && routineEntity == null) {
            throw new IllegalArgumentException("At least one of TrainingEntity or RoutineEntity must be provided");
        }

        return new UserAccessEntity(
                userAccess.getId(),
                userEntity,
                trainingEntity,
                routineEntity,
                userAccess.getAccessType(),
                userAccess.getStartDate(),
                userAccess.getEndDate()
        );
    }
}
