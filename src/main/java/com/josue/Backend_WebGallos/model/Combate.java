package com.josue.Backend_WebGallos.model;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDate;

@Entity
@Table(name = "combate")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Combate {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_combate")
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

    @ManyToOne
    @JoinColumn(name = "id_gallo_ganador")
    private Animal galloGanador; // NUEVO

    @ManyToOne
    @JoinColumn(name = "id_gallo_perdedor")
    private Animal galloPerdedor; // NUEVO

    @Column(name = "es_empate")
    private Boolean esEmpate; // NUEVO

    @Column(name = "fecha")
    private LocalDate fecha;

    private String ronda;
    private String resultado; // Puedes usarlo como texto adicional (descalificación, KO, etc.)

    @Column(name = "duracion_minutos")
    private Double duracionMinutos;

    @ManyToOne
    @JoinColumn(name = "id_juez")
    private Juez juez;

    @Column(name = "video_url")
    private String videoUrl;

    @Column(name = "lesion_gallo_1")
    private String lesionGallo1;

    @Column(name = "lesion_gallo_2")
    private String lesionGallo2;

    private String observaciones;

    @Column(nullable = false)
    private String estado; // VIGENTE, ANULADO, ELIMINADO, etc. (NUEVO)
}
