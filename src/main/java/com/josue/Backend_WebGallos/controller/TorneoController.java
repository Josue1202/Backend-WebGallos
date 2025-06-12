package com.josue.Backend_WebGallos.controller;

import com.josue.Backend_WebGallos.model.Torneo;
import com.josue.Backend_WebGallos.service.TorneoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/torneos")
public class TorneoController {

    @Autowired
    private TorneoService torneoService;

    @PostMapping
    public Torneo crearTorneo(@RequestBody Torneo torneo) {
        return torneoService.guardarTorneo(torneo);
    }

    @GetMapping
    public List<Torneo> listarTorneos() {
        return torneoService.listarTorneos();
    }

    @GetMapping("/{id}")
    public Torneo obtenerTorneo(@PathVariable Integer id) {
        return torneoService.obtenerTorneoPorId(id)
                .orElseThrow(() -> new RuntimeException("Torneo no encontrado con id: " + id));
    }

    @PutMapping("/{id}")
    public Torneo actualizarTorneo(@PathVariable Integer id, @RequestBody Torneo torneo) {
        return torneoService.actualizarTorneo(id, torneo);
    }

    @DeleteMapping("/{id}")
    public void eliminarTorneo(@PathVariable Integer id) {
        torneoService.eliminarTorneo(id);
    }
}
