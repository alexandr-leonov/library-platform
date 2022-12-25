package ru.leonov.profile.dao;

import lombok.RequiredArgsConstructor;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Repository;
import ru.leonov.profile.dao.repository.UserRepository;
import ru.leonov.profile.model.dto.UserDto;
import ru.leonov.profile.model.mapper.UserMapper;

import java.util.UUID;

@Repository
@RequiredArgsConstructor
public class UserDao {
    private final UserRepository repository;
    private final UserMapper mapper;

    public UUID save(UserDto dto) {
        var entity = mapper.toEntity(dto);
        return repository.save(entity).getId();
    }

    @Cacheable(value = "user", key = "#userId")
    public UserDto findById(UUID userId) {
        var entity = repository.findById(userId);
        if (entity.isEmpty()) {
            throw new RuntimeException(String.format("Not found user by id=%s", userId));
        }

        return mapper.toDto(entity.get());
    }


}
