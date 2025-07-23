package com.josue.Backend_WebGallos.model;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDate;

@Entity
@Table(name = "reproduccion")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Reproduccion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_reproduccion")
    private Integer idReproduccion;

    @ManyToOne
    @JoinColumn(name = "id_padre")
    private Animal padre;

    @ManyToOne
    @JoinColumn(name = "id_madre")
    private Animal madre;

    @Column(name = "fecha_cruza")
    private LocalDate fechaCruza;

    private Integer cantidadHuevos;
    private Integer cantidadNacidos;
    private Integer cantidadSobrevivientes;
    private String observaciones;

    @ManyToOne
    @JoinColumn(name = "registrado_por")
    private Usuario registradoPor;

    @Column(nullable = false)
    private String estado; // VIGENTE, ANULADO, ELIMINADO, etc.
}
