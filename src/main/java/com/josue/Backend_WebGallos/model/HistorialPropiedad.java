package com.josue.Backend_WebGallos.model;

import jakarta.persistence.*;
import lombok.*;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "historial_propiedad")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class HistorialPropiedad {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_historial")
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

    @Column(name = "fecha_transferencia")
    private LocalDate fechaTransferencia;

    @Column(name = "precio_venta")
    private BigDecimal precioVenta;

    private String motivo;

    @Column(nullable = false)
    private String estado; // VIGENTE, ANULADO, ELIMINADO, etc.
}
