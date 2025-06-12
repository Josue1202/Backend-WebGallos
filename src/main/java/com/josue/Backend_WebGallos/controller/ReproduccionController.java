package com.josue.Backend_WebGallos.controller;

import com.josue.Backend_WebGallos.model.Reproduccion;
import com.josue.Backend_WebGallos.service.ReproduccionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/reproducciones")
public class ReproduccionController {

    @Autowired
    private ReproduccionService reproduccionService;

    @PostMapping
    public Reproduccion crearReproduccion(@RequestBody Reproduccion reproduccion) {
        return reproduccionService.guardarReproduccion(reproduccion);
    }

    @GetMapping
    public List<Reproduccion> listarReproducciones() {
        return reproduccionService.listarReproducciones();
    }

    @GetMapping("/{id}")
    public Reproduccion obtenerReproduccion(@PathVariable Integer id) {
        return reproduccionService.obtenerReproduccionPorId(id)
                .orElseThrow(() -> new RuntimeException("Reproducción no encontrada con id: " + id));
    }

    @PutMapping("/{id}")
    public Reproduccion actualizarReproduccion(@PathVariable Integer id, @RequestBody Reproduccion reproduccion) {
        return reproduccionService.actualizarReproduccion(id, reproduccion);
    }

    @DeleteMapping("/{id}")
    public void eliminarReproduccion(@PathVariable Integer id) {
        reproduccionService.eliminarReproduccion(id);
    }
}