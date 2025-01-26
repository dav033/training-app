package io.github.dav033.training_app.domain.models;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Training {
    private Long id;
    private String name;
    private String description;
    private BigDecimal price;
    private LocalDateTime createdAt;
    private List<Routine> routines;

    public Training(Long id, String name, String description, BigDecimal price, LocalDateTime createdAt) {

    }
}
