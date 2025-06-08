package com.perfulandia.apigateway.jwt.dto;

import lombok.Data;
import lombok.AllArgsConstructor;

@Data
@AllArgsConstructor
public class AuthResponse {
    private String token;
    private String username;
    private String rol;
}
