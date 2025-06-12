package com.josue.Backend_WebGallos.service;

import com.josue.Backend_WebGallos.model.Torneo;
import com.josue.Backend_WebGallos.repository.TorneoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class TorneoServiceImpl implements TorneoService {

    @Autowired
    private TorneoRepository torneoRepository;

    @Override
    public Torneo guardarTorneo(Torneo torneo) {
        return torneoRepository.save(torneo);
    }

    @Override
    public Optional<Torneo> obtenerTorneoPorId(Integer id) {
        return torneoRepository.findById(id);
    }

    @Override
    public List<Torneo> listarTorneos() {
        return torneoRepository.findAll();
    }

    @Override
    public Torneo actualizarTorneo(Integer id, Torneo torneo) {
        if (torneoRepository.existsById(id)) {
            torneo.setIdTorneo(id);
            return torneoRepository.save(torneo);
        }
        throw new RuntimeException("Torneo no encontrado con id: " + id);
    }

    @Override
    public void eliminarTorneo(Integer id) {
        torneoRepository.deleteById(id);
    }
}