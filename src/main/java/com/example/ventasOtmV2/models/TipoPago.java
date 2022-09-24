package com.example.ventasOtmV2.models;

import javax.persistence.*;
import java.util.Set;

@Entity
public class TipoPago {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String medioPago;
    private Integer cuotas;

    @OneToMany(mappedBy = "tipoPagoFactura",fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Set<Factura> facturas;

    public TipoPago() {
    }
}
