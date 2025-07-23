package com.josue.Backend_WebGallos.model;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDate;

@Entity
@Table(name = "nota_animal")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class NotaAnimal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_nota")
    private Integer idNota;

    @ManyToOne
    @JoinColumn(name = "id_animal")
    private Animal animal;

    @Column(name = "fecha")
    private LocalDate fecha;

    private String nota;

    @Column(nullable = false)
    private String estado; // ACTIVO, ELIMINADO, etc.
}
