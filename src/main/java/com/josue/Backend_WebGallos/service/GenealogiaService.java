package com.josue.Backend_WebGallos.service;

import com.josue.Backend_WebGallos.model.Genealogia;

import java.util.List;
import java.util.Optional;

public interface GenealogiaService {
    Genealogia guardarGenealogia(Genealogia genealogia);
    Optional<Genealogia> obtenerGenealogiaPorId(Integer id);
    List<Genealogia> listarGenealogias();
    Genealogia actualizarGenealogia(Integer id, Genealogia genealogia);
    void eliminarGenealogia(Integer id);
}