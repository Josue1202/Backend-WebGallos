package com.josue.Backend_WebGallos.service;

import com.josue.Backend_WebGallos.model.Combate;

import java.util.List;
import java.util.Optional;

public interface CombateService {
    Combate guardarCombate(Combate combate);
    Optional<Combate> obtenerCombatePorId(Integer id);
    List<Combate> listarCombates();
    Combate actualizarCombate(Integer id, Combate combate);
    void eliminarCombate(Integer id);
}