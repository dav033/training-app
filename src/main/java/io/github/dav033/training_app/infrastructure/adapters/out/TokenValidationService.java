package io.github.dav033.training_app.infrastructure.adapters.out;

import io.github.dav033.training_app.infrastructure.entities.UserEntity;
import io.github.dav033.training_app.domain.ports.out.TokenValidationPort;
import io.github.dav033.training_app.infrastructure.security.JwtUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TokenValidationService implements TokenValidationPort {

    private final JwtUtils jwtUtils;

    @Autowired
    public TokenValidationService(JwtUtils jwtUtils) {
        this.jwtUtils = jwtUtils;
    }

    @Override
    public boolean isTokenValid(final String token, final UserEntity user) {
        final String username = extractUsernameSafely(token);

        if(username == null) {
            return false;
        }

        if(!username.equals(user.getEmail())) {
            return false;
        }

        return !jwtUtils.isTokenExpired(token);
    }

    private String extractUsernameSafely(String token) {
        try {
            return jwtUtils.extractUsername(token);
        } catch (Exception e) {
            return null;
        }
    }
}
