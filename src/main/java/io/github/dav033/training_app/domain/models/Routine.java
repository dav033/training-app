package io.github.dav033.training_app.domain.models;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Routine {
    private Long id;
    private Long trainingId;
    private String name;
    private String description;
    private BigDecimal price;
    private LocalDateTime createdAt;
    private List<Round> rounds;

    public Routine(String name, String description, BigDecimal price) {
    }
}
