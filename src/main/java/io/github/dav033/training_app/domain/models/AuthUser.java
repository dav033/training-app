package io.github.dav033.training_app.domain.models;

import lombok.*;

import java.time.LocalDateTime;
import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AuthUser {
    private UUID id;
    private String email;
    private LocalDateTime createdAt;
}