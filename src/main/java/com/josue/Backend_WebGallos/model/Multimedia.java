package com.josue.Backend_WebGallos.model;

import jakarta.persistence.*;
import lombok.*;

import java.sql.Date;

@Entity
@Table(name = "multimedia")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Multimedia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idMedia;

    @ManyToOne
    @JoinColumn(name = "id_animal")
    private Animal animal;

    private String tipo; // foto, video
    private String url;
    private String descripcion;
    private Date fecha;
}
