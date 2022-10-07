package com.example.ventasOtmV2.models;

import com.fasterxml.jackson.annotation.JsonInclude;


public class ProductoComprado {

    private Integer cantidad;
    private boolean descuento;
    private double porcentaje;
    private double precio;
    private double precioFinal;
    private Integer producto;


    public ProductoComprado(Integer cantidad, boolean descuento, double porcentaje, double precio, double precioFinal, Integer producto) {
        this.cantidad = cantidad;
        this.descuento = descuento;
        this.porcentaje = porcentaje;
        this.precio = precio;
        this.precioFinal = precioFinal;
        this.producto = producto;
    }

    @Override
    public String toString() {
        return "ProductoComprado{" +
                "cantidad=" + cantidad +
                ", descuento=" + descuento +
                ", porcentaje=" + porcentaje +
                ", precio=" + precio +
                ", precioFinal=" + precioFinal +
                ", producto=" + producto +
                '}';
    }
}
