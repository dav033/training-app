package io.github.dav033.training_app.infrastructure.adapters.out;

import io.github.dav033.training_app.application.ports.output.UserAccessPersistencePort;
import io.github.dav033.training_app.domain.models.UserAccess;
import io.github.dav033.training_app.infrastructure.adapters.out.mappers.UserAccessMapper;
import io.github.dav033.training_app.infrastructure.entities.UserEntity;
import io.github.dav033.training_app.infrastructure.entities.payment.UserAccessEntity;
import io.github.dav033.training_app.infrastructure.entities.training.RoutineEntity;
import io.github.dav033.training_app.infrastructure.entities.training.TrainingEntity;
import io.github.dav033.training_app.infrastructure.repositories.RoutineRepository;
import io.github.dav033.training_app.infrastructure.repositories.TrainingRepository;
import io.github.dav033.training_app.infrastructure.repositories.UserAccessRepository;
import io.github.dav033.training_app.infrastructure.repositories.UserRepository;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
public class UserAccessPersistenceAdapter implements UserAccessPersistencePort {
    private final UserAccessRepository repository;
    private final UserAccessMapper mapper;
    private final UserRepository userRepository;
    private final TrainingRepository trainingRepository;
    private final RoutineRepository routineRepository;

    public UserAccessPersistenceAdapter(UserAccessRepository repository, UserAccessMapper mapper, UserRepository userRepository, TrainingRepository trainingRepository, RoutineRepository routineRepository) {
        this.repository = repository;
        this.mapper = mapper;
        this.trainingRepository = trainingRepository;
        this.userRepository = userRepository;
        this.routineRepository = routineRepository;
    }

    @Transactional
    @Override
    public UserAccess save(UserAccess userAccess) {
        UserEntity userEntity = userRepository.findById(userAccess.getUserId())
                .orElseThrow(() -> new RuntimeException("User not found"));

        TrainingEntity trainingEntity = userAccess.getTrainingId() != null
                ? trainingRepository.findById(userAccess.getTrainingId()).orElse(null)
                : null;

        RoutineEntity routineEntity = userAccess.getRoutineId() != null
                ? routineRepository.findById(userAccess.getRoutineId()).orElse(null)
                : null;

        if (trainingEntity == null && routineEntity == null) {
            throw new RuntimeException("At least one of Training or Routine must be specified.");
        }

        UserAccessEntity entity = mapper.toEntity(userAccess, userEntity, trainingEntity, routineEntity);
        return mapper.toDomain(repository.save(entity));
    }
}