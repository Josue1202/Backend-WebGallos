package com.josue.Backend_WebGallos.service;

import com.josue.Backend_WebGallos.model.Animal;

import java.util.List;
import java.util.Optional;

public interface AnimalService {
    Animal guardarAnimal(Animal animal);
    Optional<Animal> obtenerAnimalPorId(Integer id);
    List<Animal> listarAnimales();
    Animal actualizarAnimal(Integer id, Animal animal);
    void eliminarAnimal(Integer id);
}
