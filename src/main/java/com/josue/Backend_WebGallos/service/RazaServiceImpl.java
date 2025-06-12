package com.josue.Backend_WebGallos.service;

import com.josue.Backend_WebGallos.model.Raza;
import com.josue.Backend_WebGallos.repository.RazaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class RazaServiceImpl implements RazaService {

    @Autowired
    private RazaRepository razaRepository;

    @Override
    public Raza guardarRaza(Raza raza) {
        return razaRepository.save(raza);
    }

    @Override
    public Optional<Raza> obtenerRazaPorId(Integer id) {
        return razaRepository.findById(id);
    }

    @Override
    public List<Raza> listarRazas() {
        return razaRepository.findAll();
    }

    @Override
    public Raza actualizarRaza(Integer id, Raza raza) {
        if (razaRepository.existsById(id)) {
            raza.setIdRaza(id);
            return razaRepository.save(raza);
        }
        throw new RuntimeException("Raza no encontrada con id: " + id);
    }

    @Override
    public void eliminarRaza(Integer id) {
        razaRepository.deleteById(id);
    }
}
