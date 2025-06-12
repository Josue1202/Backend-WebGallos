package com.josue.Backend_WebGallos.model;

import jakarta.persistence.*;
import lombok.*;

import java.sql.Date;

@Entity
@Table(name = "reproduccion")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Reproduccion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idReproduccion;

    @ManyToOne
    @JoinColumn(name = "id_padre")
    private Animal padre;

    @ManyToOne
    @JoinColumn(name = "id_madre")
    private Animal madre;

    private Date fechaCruza;
    private Integer cantidadHuevos;
    private Integer cantidadNacidos;
    private Integer cantidadSobrevivientes;
    private String observaciones;

    @ManyToOne
    @JoinColumn(name = "registrado_por")
    private Usuario registradoPor;
}
