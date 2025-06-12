package com.josue.Backend_WebGallos.service;

import com.josue.Backend_WebGallos.model.Propietario;
import com.josue.Backend_WebGallos.repository.PropietarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class PropietarioServiceImpl implements PropietarioService {

    @Autowired
    private PropietarioRepository propietarioRepository;

    @Override
    public Propietario guardarPropietario(Propietario propietario) {
        return propietarioRepository.save(propietario);
    }

    @Override
    public Optional<Propietario> obtenerPropietarioPorId(Integer id) {
        return propietarioRepository.findById(id);
    }

    @Override
    public List<Propietario> listarPropietarios() {
        return propietarioRepository.findAll();
    }

    @Override
    public Propietario actualizarPropietario(Integer id, Propietario propietario) {
        if (propietarioRepository.existsById(id)) {
            propietario.setIdPropietario(id);
            return propietarioRepository.save(propietario);
        }
        throw new RuntimeException("Propietario no encontrado con id: " + id);
    }

    @Override
    public void eliminarPropietario(Integer id) {
        propietarioRepository.deleteById(id);
    }
}
