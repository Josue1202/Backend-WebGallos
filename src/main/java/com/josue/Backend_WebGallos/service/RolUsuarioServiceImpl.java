package com.josue.Backend_WebGallos.service;

import com.josue.Backend_WebGallos.model.RolUsuario;
import com.josue.Backend_WebGallos.repository.RolUsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RolUsuarioServiceImpl implements RolUsuarioService {

    @Autowired
    private RolUsuarioRepository rolUsuarioRepository;

    @Override
    public RolUsuario guardarRol(RolUsuario rol) {
        return rolUsuarioRepository.save(rol);
    }

    @Override
    public Optional<RolUsuario> obtenerRolPorId(Integer id) {
        return rolUsuarioRepository.findById(id);
    }

    @Override
    public List<RolUsuario> listarRoles() {
        return rolUsuarioRepository.findAll();
    }

    @Override
    public RolUsuario actualizarRol(Integer id, RolUsuario rol) {
        if (rolUsuarioRepository.existsById(id)) {
            rol.setIdRol(id);
            return rolUsuarioRepository.save(rol);
        }
        throw new RuntimeException("Rol no encontrado con id: " + id);
    }

    @Override
    public void eliminarRol(Integer id) {
        rolUsuarioRepository.deleteById(id);
    }
}
