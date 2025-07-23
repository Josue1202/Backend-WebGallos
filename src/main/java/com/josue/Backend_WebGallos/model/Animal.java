package com.josue.Backend_WebGallos.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Table(name = "animal")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Animal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_animal")
    private Integer idAnimal;

    private String nombre;
    private String apodo;
    private String sexo; // 'M' = macho, 'H' = hembra

    @Column(nullable = false)
    private String estado; // activo, retirado, etc.

    private Double peso;

    @Column(name = "fecha_nacimiento")
    private LocalDate fechaNacimiento;

    @ManyToOne
    @JoinColumn(name = "id_raza")
    private Raza raza;

    @ManyToOne
    @JoinColumn(name = "id_color")
    private Color color;

    @ManyToOne
    @JoinColumn(name = "id_propietario_actual")
    private Propietario propietarioActual;

    @Column(name = "imagen_url")
    private String imagenUrl;

    private String observaciones;
}