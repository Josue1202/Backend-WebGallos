package com.josue.Backend_WebGallos.service;

import com.josue.Backend_WebGallos.model.Usuario;

import java.util.List;
import java.util.Optional;

public interface UsuarioService {
    Usuario guardarUsuario(Usuario usuario);
    Optional<Usuario> obtenerUsuarioPorId(Integer id);
    List<Usuario> listarUsuarios();
    Usuario actualizarUsuario(Integer id, Usuario usuario);
    void eliminarUsuario(Integer id);
}
