package com.josue.Backend_WebGallos.service;


import com.josue.Backend_WebGallos.model.Animal;
import com.josue.Backend_WebGallos.repository.AnimalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AnimalServiceImpl implements AnimalService {

    @Autowired
    private AnimalRepository animalRepository;

    @Override
    public Animal guardarAnimal(Animal animal) {
        return animalRepository.save(animal);
    }

    @Override
    public Optional<Animal> obtenerAnimalPorId(Integer id) {
        return animalRepository.findById(id);
    }

    @Override
    public List<Animal> listarAnimales() {
        return animalRepository.findAll();
    }

    @Override
    public Animal actualizarAnimal(Integer id, Animal animal) {
        if (animalRepository.existsById(id)) {
            animal.setIdAnimal(id);
            return animalRepository.save(animal);
        }
        throw new RuntimeException("Animal no encontrado con id: " + id);
    }

    @Override
    public void eliminarAnimal(Integer id) {
        animalRepository.deleteById(id);
    }
}