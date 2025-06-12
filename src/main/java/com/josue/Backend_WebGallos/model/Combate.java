package com.josue.Backend_WebGallos.model;

import jakarta.persistence.*;
import lombok.*;

import java.sql.Date;

@Entity
@Table(name = "combate")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Combate {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idCombate;

    @ManyToOne
    @JoinColumn(name = "id_torneo")
    private Torneo torneo;

    @ManyToOne
    @JoinColumn(name = "id_gallo_1")
    private Animal gallo1;

    @ManyToOne
    @JoinColumn(name = "id_gallo_2")
    private Animal gallo2;

    private Date fecha;
    private String ronda;
    private String resultado; // gallo1, gallo2, empate, descalificación
    private Double duracionMinutos;

    @ManyToOne
    @JoinColumn(name = "id_juez")
    private Juez juez;

    private String videoUrl;
    private String lesionGallo1;
    private String lesionGallo2;
    private String observaciones;
}