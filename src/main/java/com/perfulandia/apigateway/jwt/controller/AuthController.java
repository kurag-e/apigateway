package com.perfulandia.apigateway.jwt.controller;

import com.perfulandia.apigateway.jwt.dto.*;
import com.perfulandia.apigateway.jwt.service.AuthService;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
@RequiredArgsConstructor
public class AuthController {

    private final AuthService authService;

    @PostMapping("/login")
    public AuthResponse login(@RequestBody LoginRequest request) {
        return authService.login(request);
    }
}
