package com.example.ventasOtmV2.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.Entity;
import javax.persistence.*;
import java.util.Set;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer id;

    private String nombre;

    private String apellido;
    private String correo;

    private String idMachine;

    private String comentario1;

    private String comentario2;



    @OneToMany(mappedBy = "clienteCompra",fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    @JsonIgnore
    private Set<Compra> compras;

    @OneToMany(mappedBy = "clienteFactura",fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    @JsonIgnore
    private Set<Factura> facturas;


    public Cliente() {
    }


    public Cliente(String nombre, String apellido, String correo, String idMachine, String comentario1, String comentario2) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.idMachine = idMachine;
        this.comentario1 = comentario1;
        this.comentario2 = comentario2;
    }

    public Cliente(Integer id) {
        this.id = id;
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

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getIdMachine() {
        return idMachine;
    }

    public void setIdMachine(String idMachine) {
        this.idMachine = idMachine;
    }

    public String getComentario1() {
        return comentario1;
    }

    public void setComentario1(String comentario1) {
        this.comentario1 = comentario1;
    }

    public String getComentario2() {
        return comentario2;
    }

    public void setComentario2(String comentario2) {
        this.comentario2 = comentario2;
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
                ", apellido='" + apellido + '\'' +
                ", correo='" + correo + '\'' +
                ", idMachine='" + idMachine + '\'' +
                ", comentario1='" + comentario1 + '\'' +
                ", comentario2='" + comentario2 + '\'' +
                ", compras=" + compras +
                ", facturas=" + facturas +
                '}';
    }
}
