package com.josue.Backend_WebGallos.model;

import jakarta.persistence.*;
import lombok.*;

import java.sql.Date;

@Entity
@Table(name = "propietario")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Propietario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idPropietario;

    private String nombre;
    private String apellido;
    private String direccion;
    private String telefono;
    private String email;
    private Date fechaRegistro;
}