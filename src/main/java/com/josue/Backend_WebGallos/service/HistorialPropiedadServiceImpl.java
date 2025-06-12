package com.josue.Backend_WebGallos.service;

import com.josue.Backend_WebGallos.model.HistorialPropiedad;
import com.josue.Backend_WebGallos.repository.HistorialPropiedadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class HistorialPropiedadServiceImpl implements HistorialPropiedadService {

    @Autowired
    private HistorialPropiedadRepository historialPropiedadRepository;

    @Override
    public HistorialPropiedad guardarHistorial(HistorialPropiedad historial) {
        return historialPropiedadRepository.save(historial);
    }

    @Override
    public Optional<HistorialPropiedad> obtenerHistorialPorId(Integer id) {
        return historialPropiedadRepository.findById(id);
    }

    @Override
    public List<HistorialPropiedad> listarHistoriales() {
        return historialPropiedadRepository.findAll();
    }

    @Override
    public HistorialPropiedad actualizarHistorial(Integer id, HistorialPropiedad historial) {
        if (historialPropiedadRepository.existsById(id)) {
            historial.setIdHistorial(id);
            return historialPropiedadRepository.save(historial);
        }
        throw new RuntimeException("Historial no encontrado con id: " + id);
    }

    @Override
    public void eliminarHistorial(Integer id) {
        historialPropiedadRepository.deleteById(id);
    }
}
