package com.josue.Backend_WebGallos.service;

import com.josue.Backend_WebGallos.model.NotaAnimal;

import java.util.List;
import java.util.Optional;

public interface NotaAnimalService {
    NotaAnimal guardarNota(NotaAnimal nota);
    Optional<NotaAnimal> obtenerNotaPorId(Integer id);
    List<NotaAnimal> listarNotas();
    NotaAnimal actualizarNota(Integer id, NotaAnimal nota);
    void eliminarNota(Integer id);
}
