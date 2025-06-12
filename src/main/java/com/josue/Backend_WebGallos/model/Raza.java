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
    private Integer idRaza;

    private String nombreRaza;
    private String descripcion;
}