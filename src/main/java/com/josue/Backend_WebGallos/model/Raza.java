package com.josue.Backend_WebGallos.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "raza")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Raza {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_raza")
    private Integer idRaza;

    @Column(name = "nombre_raza")
    private String nombreRaza;

    private String descripcion;

    @Column(nullable = false)
    private String estado; // ACTIVO, INACTIVO, ELIMINADO, etc.
}
