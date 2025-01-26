package io.github.dav033.training_app.domain.models;

import io.github.dav033.training_app.domain.enums.Role;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private Long id;
    private UUID uid;
    private Role role;
    private String email;
    private LocalDateTime createdAt;
    private List<Payment> payments;

    public User(Long id, UUID uuid, Role role, String email, LocalDateTime createdAt) {
    }
}
