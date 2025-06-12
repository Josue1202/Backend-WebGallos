package com.josue.Backend_WebGallos.controller;

import com.josue.Backend_WebGallos.model.Juez;
import com.josue.Backend_WebGallos.service.JuezService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/jueces")
public class JuezController {

    @Autowired
    private JuezService juezService;

    @PostMapping
    public Juez crearJuez(@RequestBody Juez juez) {
        return juezService.guardarJuez(juez);
    }

    @GetMapping
    public List<Juez> listarJueces() {
        return juezService.listarJueces();
    }

    @GetMapping("/{id}")
    public Juez obtenerJuez(@PathVariable Integer id) {
        return juezService.obtenerJuezPorId(id)
                .orElseThrow(() -> new RuntimeException("Juez no encontrado con id: " + id));
    }

    @PutMapping("/{id}")
    public Juez actualizarJuez(@PathVariable Integer id, @RequestBody Juez juez) {
        return juezService.actualizarJuez(id, juez);
    }

    @DeleteMapping("/{id}")
    public void eliminarJuez(@PathVariable Integer id) {
        juezService.eliminarJuez(id);
    }
}