package com.josue.Backend_WebGallos.model;

import jakarta.persistence.*;
import lombok.*;

import java.sql.Date;

@Entity
@Table(name = "torneo")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Torneo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idTorneo;

    private String nombreTorneo;
    private Date fechaInicio;
    private Date fechaFin;
    private String ubicacion;
    private String tipo;
    private String estado;
    private String descripcion;
}