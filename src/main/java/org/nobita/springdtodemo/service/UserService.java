package org.nobita.springdtodemo.service;

import lombok.RequiredArgsConstructor;
import org.apache.catalina.User;
import org.nobita.springdtodemo.dto.UserResponse;
import org.nobita.springdtodemo.entity.UserEntity;
import org.nobita.springdtodemo.mapper.UserMapper;
import org.nobita.springdtodemo.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;
    private final UserMapper userMapper;

    public List<UserResponse> getAllUsers() {
        List<UserEntity> userEntities = userRepository.findAll();

        return userMapper.toUserResponseList(userEntities);
    }
}
