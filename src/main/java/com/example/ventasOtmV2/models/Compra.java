package com.example.ventasOtmV2.models;

import javax.persistence.*;

@Entity
public class Compra {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private double precioCompra;
    private Integer cantidad;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "producto_id",nullable = false)
    private Producto productoCompra;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "cliente_id",nullable = false)
    private Cliente clienteCompra;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "factura_id",nullable = false)
    private Factura facturaCompra;


    public Compra() {
    }
}
