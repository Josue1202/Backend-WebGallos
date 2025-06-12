package com.josue.Backend_WebGallos.model;

import jakarta.persistence.*;
import lombok.*;

import java.sql.Date;

@Entity
@Table(name = "ubicacion_criadero")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UbicacionCriadero {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idUbicacion;

    @ManyToOne
    @JoinColumn(name = "id_propietario")
    private Propietario propietario;

    private String direccion;
    private Double latitud;
    private Double longitud;
    private Date fechaInicio;
    private Date fechaFin;
}