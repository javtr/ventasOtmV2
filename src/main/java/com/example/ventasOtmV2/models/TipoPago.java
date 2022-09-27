package com.example.ventasOtmV2.models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Set;

@Entity
public class TipoPago {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String tipoPago;
    private Integer cuotas;

    @OneToMany(mappedBy = "tipoPagoFactura",fetch = FetchType.LAZY)
    private Set<Factura> facturas;

    public TipoPago() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTipoPago() {
        return tipoPago;
    }

    public void setTipoPago(String tipoPago) {
        this.tipoPago = tipoPago;
    }

    public Integer getCuotas() {
        return cuotas;
    }

    public void setCuotas(Integer cuotas) {
        this.cuotas = cuotas;
    }

    public Set<Factura> getFacturas() {
        return facturas;
    }

    public void setFacturas(Set<Factura> facturas) {
        this.facturas = facturas;
    }

    @Override
    public String toString() {
        return "TipoPago{" +
                "id=" + id +
                ", tipoPago='" + tipoPago + '\'' +
                ", cuotas=" + cuotas +
                ", facturas=" + facturas +
                '}';
    }
}
