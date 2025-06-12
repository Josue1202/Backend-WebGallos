package com.josue.Backend_WebGallos.service;

import com.josue.Backend_WebGallos.model.Reproduccion;
import com.josue.Backend_WebGallos.repository.ReproduccionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ReproduccionServiceImpl implements ReproduccionService {

    @Autowired
    private ReproduccionRepository reproduccionRepository;

    @Override
    public Reproduccion guardarReproduccion(Reproduccion reproduccion) {
        return reproduccionRepository.save(reproduccion);
    }

    @Override
    public Optional<Reproduccion> obtenerReproduccionPorId(Integer id) {
        return reproduccionRepository.findById(id);
    }

    @Override
    public List<Reproduccion> listarReproducciones() {
        return reproduccionRepository.findAll();
    }

    @Override
    public Reproduccion actualizarReproduccion(Integer id, Reproduccion reproduccion) {
        if (reproduccionRepository.existsById(id)) {
            reproduccion.setIdReproduccion(id);
            return reproduccionRepository.save(reproduccion);
        }
        throw new RuntimeException("Reproducción no encontrada con id: " + id);
    }

    @Override
    public void eliminarReproduccion(Integer id) {
        reproduccionRepository.deleteById(id);
    }
}