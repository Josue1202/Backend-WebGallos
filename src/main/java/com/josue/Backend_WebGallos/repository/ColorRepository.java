package com.josue.Backend_WebGallos.repository;

import com.josue.Backend_WebGallos.model.Color;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ColorRepository extends JpaRepository<Color, Integer> {
    // Puedes agregar consultas personalizadas aquí si es necesario
}
