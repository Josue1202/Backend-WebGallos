package com.josue.Backend_WebGallos.controller;

import com.josue.Backend_WebGallos.model.Raza;
import com.josue.Backend_WebGallos.service.RazaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/razas")
public class RazaController {

    @Autowired
    private RazaService razaService;

    @PostMapping
    public Raza crearRaza(@RequestBody Raza raza) {
        return razaService.guardarRaza(raza);
    }

    @GetMapping
    public List<Raza> listarRazas() {
        return razaService.listarRazas();
    }

    @GetMapping("/{id}")
    public Raza obtenerRaza(@PathVariable Integer id) {
        return razaService.obtenerRazaPorId(id)
                .orElseThrow(() -> new RuntimeException("Raza no encontrada con id: " + id));
    }

    @PutMapping("/{id}")
    public Raza actualizarRaza(@PathVariable Integer id, @RequestBody Raza raza) {
        return razaService.actualizarRaza(id, raza);
    }

    @DeleteMapping("/{id}")
    public void eliminarRaza(@PathVariable Integer id) {
        razaService.eliminarRaza(id);
    }
}