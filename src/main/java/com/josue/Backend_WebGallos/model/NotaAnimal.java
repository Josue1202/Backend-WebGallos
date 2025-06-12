package com.josue.Backend_WebGallos.model;

import jakarta.persistence.*;
import lombok.*;

import java.sql.Date;

@Entity
@Table(name = "nota_animal")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class NotaAnimal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idNota;

    @ManyToOne
    @JoinColumn(name = "id_animal")
    private Animal animal;

    private Date fecha;
    private String nota;
}
