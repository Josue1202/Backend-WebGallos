package com.josue.Backend_WebGallos.service;


import com.josue.Backend_WebGallos.model.Combate;
import com.josue.Backend_WebGallos.repository.CombateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CombateServiceImpl implements CombateService {

    @Autowired
    private CombateRepository combateRepository;

    @Override
    public Combate guardarCombate(Combate combate) {
        return combateRepository.save(combate);
    }

    @Override
    public Optional<Combate> obtenerCombatePorId(Integer id) {
        return combateRepository.findById(id);
    }

    @Override
    public List<Combate> listarCombates() {
        return combateRepository.findAll();
    }

    @Override
    public Combate actualizarCombate(Integer id, Combate combate) {
        if (combateRepository.existsById(id)) {
            combate.setIdCombate(id);
            return combateRepository.save(combate);
        }
        throw new RuntimeException("Combate no encontrado con id: " + id);
    }

    @Override
    public void eliminarCombate(Integer id) {
        combateRepository.deleteById(id);
    }
}