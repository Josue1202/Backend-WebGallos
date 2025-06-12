package com.josue.Backend_WebGallos.controller;

import com.josue.Backend_WebGallos.model.Genealogia;
import com.josue.Backend_WebGallos.service.GenealogiaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/genealogias")
public class GenealogiaController {

    @Autowired
    private GenealogiaService genealogiaService;

    @PostMapping
    public Genealogia crearGenealogia(@RequestBody Genealogia genealogia) {
        return genealogiaService.guardarGenealogia(genealogia);
    }

    @GetMapping
    public List<Genealogia> listarGenealogias() {
        return genealogiaService.listarGenealogias();
    }

    @GetMapping("/{id}")
    public Genealogia obtenerGenealogia(@PathVariable Integer id) {
        return genealogiaService.obtenerGenealogiaPorId(id)
                .orElseThrow(() -> new RuntimeException("Genealogía no encontrada con id: " + id));
    }

    @PutMapping("/{id}")
    public Genealogia actualizarGenealogia(@PathVariable Integer id, @RequestBody Genealogia genealogia) {
        return genealogiaService.actualizarGenealogia(id, genealogia);
    }

    @DeleteMapping("/{id}")
    public void eliminarGenealogia(@PathVariable Integer id) {
        genealogiaService.eliminarGenealogia(id);
    }
}
