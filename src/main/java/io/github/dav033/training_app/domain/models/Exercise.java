package io.github.dav033.training_app.domain.models;

import lombok.*;

import java.time.LocalDateTime;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Exercise {
    private Long id;
    private String name;
    private String description;
    private LocalDateTime createdAt;

    public Exercise(String name, String description) {
    }
}