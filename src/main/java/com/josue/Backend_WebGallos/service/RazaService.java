package com.josue.Backend_WebGallos.service;

import com.josue.Backend_WebGallos.model.Raza;

import java.util.List;
import java.util.Optional;

public interface RazaService {
    Raza guardarRaza(Raza raza);
    Optional<Raza> obtenerRazaPorId(Integer id);
    List<Raza> listarRazas();
    Raza actualizarRaza(Integer id, Raza raza);
    void eliminarRaza(Integer id);
}
