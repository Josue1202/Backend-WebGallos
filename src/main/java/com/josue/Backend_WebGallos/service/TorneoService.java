package com.josue.Backend_WebGallos.service;

import com.josue.Backend_WebGallos.model.Torneo;

import java.util.List;
import java.util.Optional;

public interface TorneoService {
    Torneo guardarTorneo(Torneo torneo);
    Optional<Torneo> obtenerTorneoPorId(Integer id);
    List<Torneo> listarTorneos();
    Torneo actualizarTorneo(Integer id, Torneo torneo);
    void eliminarTorneo(Integer id);
}
