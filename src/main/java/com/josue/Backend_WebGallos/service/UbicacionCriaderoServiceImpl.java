package com.josue.Backend_WebGallos.service;

import com.josue.Backend_WebGallos.model.UbicacionCriadero;
import com.josue.Backend_WebGallos.repository.UbicacionCriaderoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UbicacionCriaderoServiceImpl implements UbicacionCriaderoService {

    @Autowired
    private UbicacionCriaderoRepository ubicacionCriaderoRepository;

    @Override
    public UbicacionCriadero guardarUbicacion(UbicacionCriadero ubicacion) {
        return ubicacionCriaderoRepository.save(ubicacion);
    }

    @Override
    public Optional<UbicacionCriadero> obtenerUbicacionPorId(Integer id) {
        return ubicacionCriaderoRepository.findById(id);
    }

    @Override
    public List<UbicacionCriadero> listarUbicaciones() {
        return ubicacionCriaderoRepository.findAll();
    }

    @Override
    public UbicacionCriadero actualizarUbicacion(Integer id, UbicacionCriadero ubicacion) {
        if (ubicacionCriaderoRepository.existsById(id)) {
            ubicacion.setIdUbicacion(id);
            return ubicacionCriaderoRepository.save(ubicacion);
        }
        throw new RuntimeException("Ubicación no encontrada con id: " + id);
    }

    @Override
    public void eliminarUbicacion(Integer id) {
        ubicacionCriaderoRepository.deleteById(id);
    }
}