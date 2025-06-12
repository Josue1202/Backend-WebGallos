package com.josue.Backend_WebGallos.service;

import com.josue.Backend_WebGallos.model.Multimedia;

import java.util.List;
import java.util.Optional;

public interface MultimediaService {
    Multimedia guardarMultimedia (Multimedia multimedia);
    Optional<Multimedia> obtenerMultimediaPorId(Integer id);
    List<Multimedia> listarMultimedia();
    Multimedia actualizarMultimedia(Integer id, Multimedia multimedia);
    void eliminarMultimedia(Integer id);
}