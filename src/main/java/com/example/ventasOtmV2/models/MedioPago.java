package com.example.ventasOtmV2.models;

import javax.persistence.*;
import java.util.Set;

@Entity
public class MedioPago {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String medioPago;

    @OneToMany(mappedBy = "medioPagoFactura",fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Set<Factura> facturas;


    public MedioPago() {
    }
}
