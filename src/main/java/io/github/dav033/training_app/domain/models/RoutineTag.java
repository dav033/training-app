package io.github.dav033.training_app.domain.models;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class RoutineTag {
    private Long id;
    private Long routineId;
    private Long tagId;
}
