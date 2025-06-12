package com.josue.Backend_WebGallos.model;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.sql.Date;

@Entity
@Table(name = "historial_propiedad")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class HistorialPropiedad {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idHistorial;

    @ManyToOne
    @JoinColumn(name = "id_animal")
    private Animal animal;

    @ManyToOne
    @JoinColumn(name = "id_propietario_anterior")
    private Propietario propietarioAnterior;

    @ManyToOne
    @JoinColumn(name = "id_propietario_nuevo")
    private Propietario propietarioNuevo;

    private Date fechaTransferencia;
    private BigDecimal precioVenta;
    private String motivo;
}