package com.example.ventasOtmV2.models;

import javax.persistence.Entity;
import javax.persistence.*;
import java.util.Set;

@Entity
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer id;

    private String nombre;
    private String correo;


    @OneToMany(mappedBy = "clienteCompra",fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Set<Compra> compras;

    @OneToMany(mappedBy = "clienteFactura",fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Set<Factura> facturas;


    public Cliente() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public Set<Compra> getCompras() {
        return compras;
    }

    public void setCompras(Set<Compra> compras) {
        this.compras = compras;
    }

    public Set<Factura> getFacturas() {
        return facturas;
    }

    public void setFacturas(Set<Factura> facturas) {
        this.facturas = facturas;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", correo='" + correo + '\'' +
                ", compras=" + compras +
                ", facturas=" + facturas +
                '}';
    }
}
