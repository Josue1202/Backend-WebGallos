package com.josue.Backend_WebGallos.repository;

import com.josue.Backend_WebGallos.model.Raza;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RazaRepository extends JpaRepository<Raza, Integer> {
    // Puedes agregar consultas personalizadas aquí si es necesario
}
