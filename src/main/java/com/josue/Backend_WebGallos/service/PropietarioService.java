package com.josue.Backend_WebGallos.service;

import com.josue.Backend_WebGallos.model.Propietario;

import java.util.List;
import java.util.Optional;

public interface PropietarioService {
    Propietario guardarPropietario(Propietario propietario);
    Optional<Propietario> obtenerPropietarioPorId(Integer id);
    List<Propietario> listarPropietarios();
    Propietario actualizarPropietario(Integer id, Propietario propietario);
    void eliminarPropietario(Integer id);
}
