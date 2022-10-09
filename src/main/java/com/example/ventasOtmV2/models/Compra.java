package com.example.ventasOtmV2.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

@Entity
//@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Compra {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private double precioCompra;

    private double precioFinal;

    private Integer cantidad;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "producto_id",nullable = false)
    private Producto productoCompra;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cliente_id",nullable = false)
    private Cliente clienteCompra;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "factura_id",nullable = false)
    private Factura facturaCompra;


    public Compra() {
    }


    public Compra(double precioCompra, double precioFinal, Integer cantidad, Producto productoCompra, Cliente clienteCompra, Factura facturaCompra) {
        this.precioCompra = precioCompra;
        this.precioFinal = precioFinal;
        this.cantidad = cantidad;
        this.productoCompra = productoCompra;
        this.clienteCompra = clienteCompra;
        this.facturaCompra = facturaCompra;
    }

    public Integer getId() {
        return id;
    }

    public double getPrecioFinal() {
        return precioFinal;
    }

    public void setPrecioFinal(double precioFinal) {
        this.precioFinal = precioFinal;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public double getPrecioCompra() {
        return precioCompra;
    }

    public void setPrecioCompra(double precioCompra) {
        this.precioCompra = precioCompra;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Producto getProductoCompra() {
        return productoCompra;
    }

    public void setProductoCompra(Producto productoCompra) {
        this.productoCompra = productoCompra;
    }

    public Cliente getClienteCompra() {
        return clienteCompra;
    }

    public void setClienteCompra(Cliente clienteCompra) {
        this.clienteCompra = clienteCompra;
    }

    public Factura getFacturaCompra() {
        return facturaCompra;
    }

    public void setFacturaCompra(Factura facturaCompra) {
        this.facturaCompra = facturaCompra;
    }


    @Override
    public String toString() {
        return "Compra{" +
                "id=" + id +
                ", precioCompra=" + precioCompra +
                ", precioFinal=" + precioFinal +
                ", cantidad=" + cantidad +
                ", productoCompra=" + productoCompra +
                ", clienteCompra=" + clienteCompra +
                ", facturaCompra=" + facturaCompra +
                '}';
    }
}
