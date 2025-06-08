package com.perfulandia.apigateway.jwt.dto;

import lombok.Data;

@Data
public class LoginRequest {
    private String nombreUsuario;
    private String contrasena;
}
