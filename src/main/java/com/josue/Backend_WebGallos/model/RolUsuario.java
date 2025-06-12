package com.josue.Backend_WebGallos.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "rol_usuario")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class RolUsuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idRol;

    private String nombreRol;
    private String descripcion;
}
