package com.josue.Backend_WebGallos.service;

import com.josue.Backend_WebGallos.model.Juez;

import java.util.List;
import java.util.Optional;

public interface JuezService {
    Juez guardarJuez(Juez juez);
    Optional<Juez> obtenerJuezPorId(Integer id);
    List<Juez> listarJueces();
    Juez actualizarJuez(Integer id, Juez juez);
    void eliminarJuez(Integer id);
}
