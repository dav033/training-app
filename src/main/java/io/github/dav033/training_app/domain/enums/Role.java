package io.github.dav033.training_app.domain.enums;

import java.util.Set;

public enum Role {
    ADMIN(Set.of(Permission.READ_USER, Permission.CREATE_USER, Permission.DELETE_USER, Permission.ACCESS_ADMIN)),
    USER(Set.of(Permission.READ_USER));

    private final Set<Permission> permissions;

    Role(Set<Permission> permissions) {
        this.permissions = permissions;
    }

    // Explicitly define getPermissions() method
    public Set<Permission> getPermissions() {
        return permissions;
    }
}
