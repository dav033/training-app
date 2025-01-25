package io.github.dav033.training_app.delivery.dto;

import java.math.BigDecimal;

public record CreateTrainingRequest(String name, String description, BigDecimal price) {
}
