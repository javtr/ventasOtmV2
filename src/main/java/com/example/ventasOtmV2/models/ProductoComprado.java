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

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public boolean isDescuento() {
        return descuento;
    }

    public void setDescuento(boolean descuento) {
        this.descuento = descuento;
    }

    public double getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(double porcentaje) {
        this.porcentaje = porcentaje;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getPrecioFinal() {
        return precioFinal;
    }

    public void setPrecioFinal(double precioFinal) {
        this.precioFinal = precioFinal;
    }

    public Integer getProducto() {
        return producto;
    }

    public void setProducto(Integer producto) {
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
