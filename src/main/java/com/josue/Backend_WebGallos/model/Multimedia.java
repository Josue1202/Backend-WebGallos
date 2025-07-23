package com.josue.Backend_WebGallos.model;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDate;

@Entity
@Table(name = "multimedia")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Multimedia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_media")
    private Integer idMedia;

    @ManyToOne
    @JoinColumn(name = "id_animal")
    private Animal animal;

    private String tipo; // foto, video
    private String url;
    private String descripcion;

    @Column(name = "fecha")
    private LocalDate fecha;

    @Column(nullable = false)
    private String estado; // ACTIVO, ELIMINADO, etc.
}
