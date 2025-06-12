package com.josue.Backend_WebGallos.service;

import com.josue.Backend_WebGallos.model.NotaAnimal;
import com.josue.Backend_WebGallos.repository.NotaAnimalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NotaAnimalServiceImpl implements NotaAnimalService {

    @Autowired
    private NotaAnimalRepository notaAnimalRepository;

    @Override
    public NotaAnimal guardarNota(NotaAnimal nota) {
        return notaAnimalRepository.save(nota);
    }

    @Override
    public Optional<NotaAnimal> obtenerNotaPorId(Integer id) {
        return notaAnimalRepository.findById(id);
    }

    @Override
    public List<NotaAnimal> listarNotas() {
        return notaAnimalRepository.findAll();
    }

    @Override
    public NotaAnimal actualizarNota(Integer id, NotaAnimal nota) {
        if (notaAnimalRepository.existsById(id)) {
            nota.setIdNota(id);
            return notaAnimalRepository.save(nota);
        }
        throw new RuntimeException("Nota no encontrada con id: " + id);
    }

    @Override
    public void eliminarNota(Integer id) {
        notaAnimalRepository.deleteById(id);
    }
}