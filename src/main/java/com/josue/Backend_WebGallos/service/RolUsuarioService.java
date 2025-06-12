package com.josue.Backend_WebGallos.service;

import com.josue.Backend_WebGallos.model.RolUsuario;

import java.util.List;
import java.util.Optional;

public interface RolUsuarioService {
    RolUsuario guardarRol(RolUsuario rol);
    Optional<RolUsuario> obtenerRolPorId(Integer id);
    List<RolUsuario> listarRoles();
    RolUsuario actualizarRol(Integer id, RolUsuario rol);
    void eliminarRol(Integer id);
}
