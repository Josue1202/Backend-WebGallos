package com.josue.Backend_WebGallos.controller;

import com.josue.Backend_WebGallos.model.Propietario;
import com.josue.Backend_WebGallos.service.PropietarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/propietarios")
public class PropietarioController {

    @Autowired
    private PropietarioService propietarioService;

    @PostMapping
    public Propietario crearPropietario(@RequestBody Propietario propietario) {
        return propietarioService.guardarPropietario(propietario);
    }

    @GetMapping
    public List<Propietario> listarPropietarios() {
        return propietarioService.listarPropietarios();
    }

    @GetMapping("/{id}")
    public Propietario obtenerPropietario(@PathVariable Integer id) {
        return propietarioService.obtenerPropietarioPorId(id)
                .orElseThrow(() -> new RuntimeException("Propietario no encontrado con id: " + id));
    }

    @PutMapping("/{id}")
    public Propietario actualizarPropietario(@PathVariable Integer id, @RequestBody Propietario propietario) {
        return propietarioService.actualizarPropietario(id, propietario);
    }

    @DeleteMapping("/{id}")
    public void eliminarPropietario(@PathVariable Integer id) {
        propietarioService.eliminarPropietario(id);
    }
}
