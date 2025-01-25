package io.github.dav033.training_app.infrastructure.adapters.out.mappers;

import io.github.dav033.training_app.domain.models.User;
import io.github.dav033.training_app.infrastructure.entities.UserEntity;
import org.springframework.stereotype.Component;

@Component
public class UserMapper {

    public User toDomain(UserEntity entity) {
        if (entity == null) {
            return null;
        }
        return new User(
                entity.getId(),
                entity.getUuid(),
                entity.getRole(),
                entity.getEmail(),
                entity.getCreatedAt()
        );
    }

    public UserEntity toEntity(User user) {
        if (user == null) {
            return null;
        }
        UserEntity entity = new UserEntity();
        entity.setId(user.getId());
        entity.setUuid(user.getUid());
        entity.setRole(user.getRole());
        entity.setEmail(user.getEmail());
        entity.setCreatedAt(user.getCreatedAt());
        return entity;
    }
}
