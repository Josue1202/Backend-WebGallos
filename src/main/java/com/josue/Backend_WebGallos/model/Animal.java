package com.josue.Backend_WebGallos.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "animal")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Animal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idAnimal;

    private String nombre;
    private String apodo;
    private String sexo; // 'M' = macho, 'H' = hembra
    private String estado; // activo, retirado, etc.
    private Double peso;

    @Column(name = "fecha_nacimiento")
    private java.sql.Date fechaNacimiento;

    @ManyToOne
    @JoinColumn(name = "id_raza")
    private Raza raza;

    @ManyToOne
    @JoinColumn(name = "id_color")
    private Color color;

    @ManyToOne
    @JoinColumn(name = "id_propietario_actual")
    private Propietario propietarioActual;

    private String imagenUrl;
    private String observaciones;
}