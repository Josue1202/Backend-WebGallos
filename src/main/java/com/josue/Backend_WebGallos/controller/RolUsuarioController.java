package com.josue.Backend_WebGallos.controller;

import com.josue.Backend_WebGallos.model.RolUsuario;
import com.josue.Backend_WebGallos.service.RolUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/roles")
public class RolUsuarioController {

    @Autowired
    private RolUsuarioService rolUsuarioService;

    @PostMapping
    public RolUsuario crearRol(@RequestBody RolUsuario rol) {
        return rolUsuarioService.guardarRol(rol);
    }

    @GetMapping
    public List<RolUsuario> listarRoles() {
        return rolUsuarioService.listarRoles();
    }

    @GetMapping("/{id}")
    public RolUsuario obtenerRol(@PathVariable Integer id) {
        return rolUsuarioService.obtenerRolPorId(id)
                .orElseThrow(() -> new RuntimeException("Rol no encontrado con id: " + id));
    }

    @PutMapping("/{id}")
    public RolUsuario actualizarRol(@PathVariable Integer id, @RequestBody RolUsuario rol) {
        return rolUsuarioService.actualizarRol(id, rol);
    }

    @DeleteMapping("/{id}")
    public void eliminarRol(@PathVariable Integer id) {
        rolUsuarioService.eliminarRol(id);
    }
}
