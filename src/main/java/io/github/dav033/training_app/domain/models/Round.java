package io.github.dav033.training_app.domain.models;

import java.time.LocalDateTime;
import java.util.List;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Round {
    private Long id;
    private Integer rest;
    private LocalDateTime createdAt;
    private Long routineId;
    private Long roundTypeId;
    private List<RoundExercise> exercises;
}
