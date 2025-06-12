package com.josue.Backend_WebGallos.service;

import com.josue.Backend_WebGallos.model.TratamientoSalud;
import com.josue.Backend_WebGallos.repository.TratamientoSaludRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TratamientoSaludServiceImpl implements TratamientoSaludService {

    @Autowired
    private TratamientoSaludRepository tratamientoSaludRepository;

    @Override
    public TratamientoSalud guardarTratamiento(TratamientoSalud tratamiento) {
        return tratamientoSaludRepository.save(tratamiento);
    }

    @Override
    public Optional<TratamientoSalud> obtenerTratamientoPorId(Integer id) {
        return tratamientoSaludRepository.findById(id);
    }

    @Override
    public List<TratamientoSalud> listarTratamientos() {
        return tratamientoSaludRepository.findAll();
    }

    @Override
    public TratamientoSalud actualizarTratamiento(Integer id, TratamientoSalud tratamiento) {
        if (tratamientoSaludRepository.existsById(id)) {
            tratamiento.setIdTratamiento(id);
            return tratamientoSaludRepository.save(tratamiento);
        }
        throw new RuntimeException("Tratamiento no encontrado con id: " + id);
    }

    @Override
    public void eliminarTratamiento(Integer id) {
        tratamientoSaludRepository.deleteById(id);
    }
}
