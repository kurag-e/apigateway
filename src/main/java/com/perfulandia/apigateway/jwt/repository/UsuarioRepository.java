package com.perfulandia.apigateway.jwt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.perfulandia.apigateway.jwt.model.Usuario;

import java.util.Optional;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    Optional<Usuario> findByNombreUsuario(String nombreUsuario); //Usa el nombre exacto del atributo
}