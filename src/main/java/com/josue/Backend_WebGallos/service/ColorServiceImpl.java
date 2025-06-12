package com.josue.Backend_WebGallos.service;

import com.josue.Backend_WebGallos.model.Color;
import com.josue.Backend_WebGallos.repository.ColorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class ColorServiceImpl implements ColorService {

    @Autowired
    private ColorRepository colorRepository;

    @Override
    public Color guardarColor(Color color) {
        return colorRepository.save(color);
    }

    @Override
    public Optional<Color> obtenerColorPorId(Integer id) {
        return colorRepository.findById(id);
    }

    @Override
    public List<Color> listarColores() {
        return colorRepository.findAll();
    }

    @Override
    public Color actualizarColor(Integer id, Color color) {
        if (colorRepository.existsById(id)) {
            color.setIdColor(id);
            return colorRepository.save(color);
        }
        throw new RuntimeException("Color no encontrado con id: " + id);
    }

    @Override
    public void eliminarColor(Integer id) {
        colorRepository.deleteById(id);
    }
}