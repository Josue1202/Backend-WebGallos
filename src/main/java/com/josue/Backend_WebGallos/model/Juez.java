package com.josue.Backend_WebGallos.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "juez")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Juez {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idJuez;

    private String nombre;
    private String apellido;
    private String telefono;
    private String email;
}