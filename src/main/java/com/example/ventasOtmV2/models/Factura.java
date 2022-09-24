package com.example.ventasOtmV2.models;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Factura {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @JsonFormat(pattern = "yyyy-MM-dd",shape = JsonFormat.Shape.STRING)
    private String fechaCompra;
    private double valorCompra;
    private boolean compraActiva;

    @OneToMany(mappedBy = "facturaCompra",fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Set<Compra> compras;

    @OneToMany(mappedBy = "facturaPago",fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Set<Pago> pagos;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "medioPago_id",nullable = false)
    private MedioPago medioPagoFactura;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "tipoPago_id",nullable = false)
    private TipoPago tipoPagoFactura;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "cliente_id",nullable = false)
    private Cliente clienteFactura;


    public Factura() {
    }
}
