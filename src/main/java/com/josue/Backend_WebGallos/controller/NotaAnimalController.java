package com.josue.Backend_WebGallos.controller;

import com.josue.Backend_WebGallos.model.NotaAnimal;
import com.josue.Backend_WebGallos.service.NotaAnimalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/notas")
public class NotaAnimalController {

    @Autowired
    private NotaAnimalService notaAnimalService;

    @PostMapping
    public NotaAnimal crearNota(@RequestBody NotaAnimal nota) {
        return notaAnimalService.guardarNota(nota);
    }

    @GetMapping
    public List<NotaAnimal> listarNotas() {
        return notaAnimalService.listarNotas();
    }

    @GetMapping("/{id}")
    public NotaAnimal obtenerNota(@PathVariable Integer id) {
        return notaAnimalService.obtenerNotaPorId(id)
                .orElseThrow(() -> new RuntimeException("Nota no encontrada con id: " + id));
    }

    @PutMapping("/{id}")
    public NotaAnimal actualizarNota(@PathVariable Integer id, @RequestBody NotaAnimal nota) {
        return notaAnimalService.actualizarNota(id, nota);
    }

    @DeleteMapping("/{id}")
    public void eliminarNota(@PathVariable Integer id) {
        notaAnimalService.eliminarNota(id);
    }
}
