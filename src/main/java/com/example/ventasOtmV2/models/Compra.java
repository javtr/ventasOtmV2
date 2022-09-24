package com.example.ventasOtmV2.models;

import javax.persistence.*;

@Entity
public class Compra {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private double precioCompra;
    private Integer cantidad;

    @ManyToOne
    @JoinColumn(name = "producto_id",nullable = false)
    private Producto producto;


    public Compra() {
    }
}
