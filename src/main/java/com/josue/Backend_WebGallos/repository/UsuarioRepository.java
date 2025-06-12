package com.josue.Backend_WebGallos.repository;

import com.josue.Backend_WebGallos.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {}