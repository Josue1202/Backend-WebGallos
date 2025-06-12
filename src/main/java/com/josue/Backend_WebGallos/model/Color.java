package com.josue.Backend_WebGallos.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "color")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Color {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idColor;

    private String nombreColor;
}
