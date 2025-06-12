package com.josue.Backend_WebGallos.repository;


import com.josue.Backend_WebGallos.model.Animal;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AnimalRepository extends JpaRepository<Animal, Integer> {
    // Puedes agregar consultas personalizadas aquí
}
