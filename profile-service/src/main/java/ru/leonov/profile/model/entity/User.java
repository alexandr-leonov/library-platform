package ru.leonov.profile.model.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.PositiveOrZero;
import lombok.*;

import java.math.BigDecimal;
import java.time.ZonedDateTime;
import java.util.UUID;

import static java.time.ZoneOffset.UTC;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "users")
public class User {

    // move to base entity
    @Id
    @GeneratedValue
    private UUID id;

    @Column(name = "created_date", nullable = false)
    protected ZonedDateTime createdDate = ZonedDateTime.now(UTC);
    @Column(name = "updated_date", nullable = false)
    protected ZonedDateTime updatedDate = ZonedDateTime.now(UTC);
    @Column(name = "created_by")
    protected String createdBy;
    @Column(name = "updated_by")
    protected String updatedBy;


    private static final String PHONE_FORMATTER = "^(\\+\\d{1,3}( )?)?((\\(\\d{3}\\))|\\d{3})[- .]?\\d{3}[- .]?\\d{4}$";

    @NotBlank
    @Column(name = "name", nullable = false, length = 200)
    private String name;
    @PositiveOrZero
    @Column(name = "amount", nullable = false, length = 100)
    private BigDecimal amount;

    @Email(message = "Invalid email")
    @Column(name = "email", length = 200)
    private String email;

    @Pattern(regexp = PHONE_FORMATTER, message = "Invalid phone number")
    @Column(name = "phone", length = 20)
    private String phone;

}
