package io.github.dav033.training_app.domain.models;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class RoundExercise {
    private Long id;
    private Exercise exercise;
    private String repetitions;
    private Integer position;

    public RoundExercise(Exercise domain, String repetitions, Integer position) {
    }
}
