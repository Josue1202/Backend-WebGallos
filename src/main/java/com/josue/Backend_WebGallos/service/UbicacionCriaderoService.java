package com.josue.Backend_WebGallos.service;

import com.josue.Backend_WebGallos.model.UbicacionCriadero;

import java.util.List;
import java.util.Optional;

public interface UbicacionCriaderoService {
    UbicacionCriadero guardarUbicacion(UbicacionCriadero ubicacion);
    Optional<UbicacionCriadero> obtenerUbicacionPorId(Integer id);
    List<UbicacionCriadero> listarUbicaciones();
    UbicacionCriadero actualizarUbicacion(Integer id, UbicacionCriadero ubicacion);
    void eliminarUbicacion(Integer id);
}
