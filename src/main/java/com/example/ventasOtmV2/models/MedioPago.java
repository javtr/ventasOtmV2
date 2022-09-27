package com.example.ventasOtmV2.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.Set;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class MedioPago {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String medioPago;

    @OneToMany(mappedBy = "medioPagoFactura",fetch = FetchType.LAZY)
    @JsonIgnore
    private Set<Factura> facturas;


    public MedioPago() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMedioPago() {
        return medioPago;
    }

    public void setMedioPago(String medioPago) {
        this.medioPago = medioPago;
    }

    public Set<Factura> getFacturas() {
        return facturas;
    }

    public void setFacturas(Set<Factura> facturas) {
        this.facturas = facturas;
    }


    @Override
    public String toString() {
        return "MedioPago{" +
                "id=" + id +
                ", medioPago='" + medioPago + '\'' +
                ", facturas=" + facturas +
                '}';
    }
}
