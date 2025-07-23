package com.josue.Backend_WebGallos.model;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDate;

@Entity
@Table(name = "ubicacion_criadero")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UbicacionCriadero {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_ubicacion")
    private Integer idUbicacion;

    @ManyToOne
    @JoinColumn(name = "id_propietario")
    private Propietario propietario;

    private String direccion;
    private Double latitud;
    private Double longitud;

    @Column(name = "fecha_inicio")
    private LocalDate fechaInicio;

    @Column(name = "fecha_fin")
    private LocalDate fechaFin;

    @Column(nullable = false)
    private String estado; // VIGENTE, ANULADO, ELIMINADO, etc.
}
