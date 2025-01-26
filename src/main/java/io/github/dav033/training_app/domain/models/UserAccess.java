package io.github.dav033.training_app.domain.models;

import io.github.dav033.training_app.domain.enums.AccessType;

import java.time.LocalDateTime;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserAccess {
    private Long id;
    private Long userId;
    private Long trainingId;
    private Long routineId;
    private AccessType accessType;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
}
