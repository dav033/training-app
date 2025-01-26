package io.github.dav033.training_app.domain.models;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class TrainingTag {
    private Long id;
    private Long trainingId;
    private Long tagId;
}
