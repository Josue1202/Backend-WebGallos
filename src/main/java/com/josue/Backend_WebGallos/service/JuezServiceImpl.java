package com.josue.Backend_WebGallos.service;

import com.josue.Backend_WebGallos.model.Juez;
import com.josue.Backend_WebGallos.repository.JuezRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JuezServiceImpl implements JuezService {

    @Autowired
    private JuezRepository juezRepository;

    @Override
    public Juez guardarJuez(Juez juez) {
        return juezRepository.save(juez);
    }

    @Override
    public Optional<Juez> obtenerJuezPorId(Integer id) {
        return juezRepository.findById(id);
    }

    @Override
    public List<Juez> listarJueces() {
        return juezRepository.findAll();
    }

    @Override
    public Juez actualizarJuez(Integer id, Juez juez) {
        if (juezRepository.existsById(id)) {
            juez.setIdJuez(id);
            return juezRepository.save(juez);
        }
        throw new RuntimeException("Juez no encontrado con id: " + id);
    }

    @Override
    public void eliminarJuez(Integer id) {
        juezRepository.deleteById(id);
    }
}
