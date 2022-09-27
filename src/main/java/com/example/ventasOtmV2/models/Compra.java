package com.example.ventasOtmV2.models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
public class Compra {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private double precioCompra;
    private Integer cantidad;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "producto_id",nullable = false)
    @JsonIgnore
    private Producto productoCompra;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cliente_id",nullable = false)
    @JsonIgnore
    private Cliente clienteCompra;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "factura_id",nullable = false)
    @JsonIgnore
    private Factura facturaCompra;


    public Compra() {
    }

    public Integer getId() {
        return id;
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
                ", cantidad=" + cantidad +
                ", productoCompra=" + productoCompra +
                ", clienteCompra=" + clienteCompra +
                ", facturaCompra=" + facturaCompra +
                '}';
    }
}
