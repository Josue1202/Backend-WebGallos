package com.josue.Backend_WebGallos.controller;

import com.josue.Backend_WebGallos.model.TratamientoSalud;
import com.josue.Backend_WebGallos.service.TratamientoSaludService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tratamientos")
public class TratamientoSaludController {

    @Autowired
    private TratamientoSaludService tratamientoSaludService;

    @PostMapping
    public TratamientoSalud crearTratamiento(@RequestBody TratamientoSalud tratamiento) {
        return tratamientoSaludService.guardarTratamiento(tratamiento);
    }

    @GetMapping
    public List<TratamientoSalud> listarTratamientos() {
        return tratamientoSaludService.listarTratamientos();
    }

    @GetMapping("/{id}")
    public TratamientoSalud obtenerTratamiento(@PathVariable Integer id) {
        return tratamientoSaludService.obtenerTratamientoPorId(id)
                .orElseThrow(() -> new RuntimeException("Tratamiento no encontrado con id: " + id));
    }

    @PutMapping("/{id}")
    public TratamientoSalud actualizarTratamiento(@PathVariable Integer id, @RequestBody TratamientoSalud tratamiento) {
        return tratamientoSaludService.actualizarTratamiento(id, tratamiento);
    }

    @DeleteMapping("/{id}")
    public void eliminarTratamiento(@PathVariable Integer id) {
        tratamientoSaludService.eliminarTratamiento(id);
    }
}
