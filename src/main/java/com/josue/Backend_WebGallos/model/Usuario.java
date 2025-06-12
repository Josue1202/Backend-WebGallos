package com.josue.Backend_WebGallos.model;

import jakarta.persistence.*;
import lombok.*;

import java.sql.Date;

@Entity
@Table(name = "usuario")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idUsuario;

    private String nombre;
    private String apellido;
    private String usuario;
    private String email;
    private String telefono;
    private String contrasena;
    private Date fechaRegistro;

    @ManyToOne
    @JoinColumn(name = "id_rol")
    private RolUsuario rol;
}