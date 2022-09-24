package com.example.ventasOtmV2.models;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String nombre;
    private double correo;

    @OneToMany(mappedBy = "productoCompra",fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Set<Compra> compras;

    public Producto() {
    }
}
