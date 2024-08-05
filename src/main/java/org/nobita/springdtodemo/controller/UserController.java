package org.nobita.springdtodemo.controller;

import lombok.RequiredArgsConstructor;
import org.nobita.springdtodemo.dto.UserResponse;
import org.nobita.springdtodemo.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @GetMapping("/users")
    public List<UserResponse> getAllUsers() {
        return userService.getAllUsers();
    }
}
