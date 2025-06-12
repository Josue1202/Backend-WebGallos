package com.josue.Backend_WebGallos.service;

import com.josue.Backend_WebGallos.model.Color;

import java.util.List;
import java.util.Optional;

public interface ColorService {
    Color guardarColor(Color color);
    Optional<Color> obtenerColorPorId(Integer id);
    List<Color> listarColores();
    Color actualizarColor(Integer id, Color color);
    void eliminarColor(Integer id);
}