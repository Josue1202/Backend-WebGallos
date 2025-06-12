package com.josue.Backend_WebGallos.service;

import com.josue.Backend_WebGallos.model.HistorialPropiedad;

import java.util.List;
import java.util.Optional;

public interface HistorialPropiedadService {
    HistorialPropiedad guardarHistorial(HistorialPropiedad historial);
    Optional<HistorialPropiedad> obtenerHistorialPorId(Integer id);
    List<HistorialPropiedad> listarHistoriales();
    HistorialPropiedad actualizarHistorial(Integer id, HistorialPropiedad historial);
    void eliminarHistorial(Integer id);
}