package com.josue.Backend_WebGallos.controller;

import com.josue.Backend_WebGallos.model.HistorialPropiedad;
import com.josue.Backend_WebGallos.service.HistorialPropiedadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/historiales")
public class HistorialPropiedadController {

    @Autowired
    private HistorialPropiedadService historialPropiedadService;

    @PostMapping
    public HistorialPropiedad crearHistorial(@RequestBody HistorialPropiedad historial) {
        return historialPropiedadService.guardarHistorial(historial);
    }

    @GetMapping
    public List<HistorialPropiedad> listarHistoriales() {
        return historialPropiedadService.listarHistoriales();
    }

    @GetMapping("/{id}")
    public HistorialPropiedad obtenerHistorial(@PathVariable Integer id) {
        return historialPropiedadService.obtenerHistorialPorId(id)
                .orElseThrow(() -> new RuntimeException("Historial no encontrado con id: " + id));
    }

    @PutMapping("/{id}")
    public HistorialPropiedad actualizarHistorial(@PathVariable Integer id, @RequestBody HistorialPropiedad historial) {
        return historialPropiedadService.actualizarHistorial(id, historial);
    }

    @DeleteMapping("/{id}")
    public void eliminarHistorial(@PathVariable Integer id) {
        historialPropiedadService.eliminarHistorial(id);
    }
}
