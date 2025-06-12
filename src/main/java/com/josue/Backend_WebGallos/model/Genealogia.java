package com.josue.Backend_WebGallos.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "genealogia")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Genealogia {
    @Id
    private Integer idAnimal; // Mismo id que animal

    @ManyToOne
    @JoinColumn(name = "id_padre")
    private Animal padre;

    @ManyToOne
    @JoinColumn(name = "id_madre")
    private Animal madre;
}