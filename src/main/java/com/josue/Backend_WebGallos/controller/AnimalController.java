package com.josue.Backend_WebGallos.controller;

import com.josue.Backend_WebGallos.model.Animal;
import com.josue.Backend_WebGallos.service.AnimalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/animales")
public class AnimalController {

    @Autowired
    private AnimalService animalService;

    @PostMapping
    public Animal crearAnimal(@RequestBody Animal animal) {
        return animalService.guardarAnimal(animal);
    }

    @GetMapping
    public List<Animal> listarAnimales() {
        return animalService.listarAnimales();
    }

    @GetMapping("/{id}")
    public Animal obtenerAnimal(@PathVariable Integer id) {
        return animalService.obtenerAnimalPorId(id)
                .orElseThrow(() -> new RuntimeException("Animal no encontrado con id: " + id));
    }

    @PutMapping("/{id}")
    public Animal actualizarAnimal(@PathVariable Integer id, @RequestBody Animal animal) {
        return animalService.actualizarAnimal(id, animal);
    }

    @DeleteMapping("/{id}")
    public void eliminarAnimal(@PathVariable Integer id) {
        animalService.eliminarAnimal(id);
    }
}
