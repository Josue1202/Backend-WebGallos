package com.josue.Backend_WebGallos.service;

import com.josue.Backend_WebGallos.model.TratamientoSalud;

import java.util.List;
import java.util.Optional;

public interface TratamientoSaludService {
    TratamientoSalud guardarTratamiento(TratamientoSalud tratamiento);
    Optional<TratamientoSalud> obtenerTratamientoPorId(Integer id);
    List<TratamientoSalud> listarTratamientos();
    TratamientoSalud actualizarTratamiento(Integer id, TratamientoSalud tratamiento);
    void eliminarTratamiento(Integer id);
}
