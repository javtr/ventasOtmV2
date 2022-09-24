package com.example.ventasOtmV2.models;

import javax.persistence.Entity;
import javax.persistence.*;

@Entity
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String nombre;
    private String correo;


    public Cliente() {
    }
}
