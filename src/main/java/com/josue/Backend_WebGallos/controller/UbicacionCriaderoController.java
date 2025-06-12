package com.josue.Backend_WebGallos.controller;

import com.josue.Backend_WebGallos.model.UbicacionCriadero;
import com.josue.Backend_WebGallos.service.UbicacionCriaderoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/ubicaciones")
public class UbicacionCriaderoController {

    @Autowired
    private UbicacionCriaderoService ubicacionCriaderoService;

    @PostMapping
    public UbicacionCriadero crearUbicacion(@RequestBody UbicacionCriadero ubicacion) {
        return ubicacionCriaderoService.guardarUbicacion(ubicacion);
    }

    @GetMapping
    public List<UbicacionCriadero> listarUbicaciones() {
        return ubicacionCriaderoService.listarUbicaciones();
    }

    @GetMapping("/{id}")
    public UbicacionCriadero obtenerUbicacion(@PathVariable Integer id) {
        return ubicacionCriaderoService.obtenerUbicacionPorId(id)
                .orElseThrow(() -> new RuntimeException("Ubicación no encontrada con id: " + id));
    }

    @PutMapping("/{id}")
    public UbicacionCriadero actualizarUbicacion(@PathVariable Integer id, @RequestBody UbicacionCriadero ubicacion) {
        return ubicacionCriaderoService.actualizarUbicacion(id, ubicacion);
    }

    @DeleteMapping("/{id}")
    public void eliminarUbicacion(@PathVariable Integer id) {
        ubicacionCriaderoService.eliminarUbicacion(id);
    }
}
