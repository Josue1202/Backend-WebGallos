package com.josue.Backend_WebGallos.model;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDate;

@Entity
@Table(name = "tratamiento_salud")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TratamientoSalud {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_tratamiento")
    private Integer idTratamiento;

    @ManyToOne
    @JoinColumn(name = "id_animal")
    private Animal animal;

    @Column(name = "fecha")
    private LocalDate fecha;

    @Column(name = "tipo_tratamiento")
    private String tipoTratamiento;

    private String descripcion;
    private String veterinario;

    @Column(name = "documento_url")
    private String documentoUrl;

    @Column(nullable = false)
    private String estado; // VIGENTE, ANULADO, ELIMINADO, etc.
}
