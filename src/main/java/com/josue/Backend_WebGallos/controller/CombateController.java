package com.josue.Backend_WebGallos.controller;

import com.josue.Backend_WebGallos.model.Combate;
import com.josue.Backend_WebGallos.service.CombateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/combates")
public class CombateController {

    @Autowired
    private CombateService combateService;

    @PostMapping
    public Combate crearCombate(@RequestBody Combate combate) {
        return combateService.guardarCombate(combate);
    }

    @GetMapping
    public List<Combate> listarCombates() {
        return combateService.listarCombates();
    }

    @GetMapping("/{id}")
    public Combate obtenerCombate(@PathVariable Integer id) {
        return combateService.obtenerCombatePorId(id)
                .orElseThrow(() -> new RuntimeException("Combate no encontrado con id: " + id));
    }

    @PutMapping("/{id}")
    public Combate actualizarCombate(@PathVariable Integer id, @RequestBody Combate combate) {
        return combateService.actualizarCombate(id, combate);
    }

    @DeleteMapping("/{id}")
    public void eliminarCombate(@PathVariable Integer id) {
        combateService.eliminarCombate(id);
    }
}
