package com.josue.Backend_WebGallos.controller;

import com.josue.Backend_WebGallos.model.Color;
import com.josue.Backend_WebGallos.service.ColorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/colores")
public class ColorController {

    @Autowired
    private ColorService colorService;

    @PostMapping
    public Color crearColor(@RequestBody Color color) {
        return colorService.guardarColor(color);
    }

    @GetMapping
    public List<Color> listarColores() {
        return colorService.listarColores();
    }

    @GetMapping("/{id}")
    public Color obtenerColor(@PathVariable Integer id) {
        return colorService.obtenerColorPorId(id)
                .orElseThrow(() -> new RuntimeException("Color no encontrado con id: " + id));
    }

    @PutMapping("/{id}")
    public Color actualizarColor(@PathVariable Integer id, @RequestBody Color color) {
        return colorService.actualizarColor(id, color);
    }

    @DeleteMapping("/{id}")
    public void eliminarColor(@PathVariable Integer id) {
        colorService.eliminarColor(id);
    }
}
