package com.josue.Backend_WebGallos.service;

import com.josue.Backend_WebGallos.model.Multimedia;
import com.josue.Backend_WebGallos.repository.MultimediaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MultimediaServiceImpl implements MultimediaService {

    @Autowired
    private MultimediaRepository multimediaRepository;

    @Override
    public Multimedia guardarMultimedia(Multimedia multimedia) {
        return multimediaRepository.save(multimedia);
    }

    @Override
    public Optional<Multimedia> obtenerMultimediaPorId(Integer id) {
        return multimediaRepository.findById(id);
    }

    @Override
    public List<Multimedia> listarMultimedia() {
        return multimediaRepository.findAll();
    }

    @Override
    public Multimedia actualizarMultimedia(Integer id, Multimedia multimedia) {
        if (multimediaRepository.existsById(id)) {
            multimedia.setIdMedia(id);
            return multimediaRepository.save(multimedia);
        }
        throw new RuntimeException("Multimedia no encontrada con id: " + id);
    }

    @Override
    public void eliminarMultimedia(Integer id) {
        multimediaRepository.deleteById(id);
    }
}
