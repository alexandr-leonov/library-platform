package ru.leonov.profile.model.dto;

import java.math.BigDecimal;
import java.util.UUID;

public record UserDto(UUID userId,
                      String name,
                      String email,
                      String phone,
                      BigDecimal amount) {

}
