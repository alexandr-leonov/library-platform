package ru.leonov.profile.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.leonov.profile.model.dto.UserDto;
import ru.leonov.profile.dao.UserDao;
import ru.leonov.profile.service.ProfileService;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class ProfileServiceImpl implements ProfileService {
    private final UserDao userDao;

    @Override
    public UUID registration(UserDto userDto) {
        return userDao.save(userDto);
    }

    @Override
    public UserDto profile(UUID userId) {
        return userDao.findById(userId);
    }
}
