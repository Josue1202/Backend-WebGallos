package com.josue.Backend_WebGallos.model;

import jakarta.persistence.*;
import lombok.*;

import java.sql.Date;

@Entity
@Table(name = "tratamiento_salud")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TratamientoSalud {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idTratamiento;

    @ManyToOne
    @JoinColumn(name = "id_animal")
    private Animal animal;

    private Date fecha;
    private String tipoTratamiento;
    private String descripcion;
    private String veterinario;
    private String documentoUrl;
}