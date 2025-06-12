package com.josue.Backend_WebGallos.service;

import com.josue.Backend_WebGallos.model.Reproduccion;

import java.util.List;
import java.util.Optional;

public interface ReproduccionService {
    Reproduccion guardarReproduccion(Reproduccion reproduccion);
    Optional<Reproduccion> obtenerReproduccionPorId(Integer id);
    List<Reproduccion> listarReproducciones();
    Reproduccion actualizarReproduccion(Integer id, Reproduccion reproduccion);
    void eliminarReproduccion(Integer id);
}
