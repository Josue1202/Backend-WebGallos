package com.josue.Backend_WebGallos.service;

import com.josue.Backend_WebGallos.model.Genealogia;
import com.josue.Backend_WebGallos.repository.GenealogiaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GenealogiaServiceImpl implements GenealogiaService {

    @Autowired
    private GenealogiaRepository genealogiaRepository;

    @Override
    public Genealogia guardarGenealogia(Genealogia genealogia) {
        return genealogiaRepository.save(genealogia);
    }

    @Override
    public Optional<Genealogia> obtenerGenealogiaPorId(Integer id) {
        return genealogiaRepository.findById(id);
    }

    @Override
    public List<Genealogia> listarGenealogias() {
        return genealogiaRepository.findAll();
    }

    @Override
    public Genealogia actualizarGenealogia(Integer id, Genealogia genealogia) {
        if (genealogiaRepository.existsById(id)) {
            genealogia.setIdAnimal(id);
            return genealogiaRepository.save(genealogia);
        }
        throw new RuntimeException("Genealogía no encontrada con id: " + id);
    }

    @Override
    public void eliminarGenealogia(Integer id) {
        genealogiaRepository.deleteById(id);
    }
}
