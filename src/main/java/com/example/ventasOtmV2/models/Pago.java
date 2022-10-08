package com.example.ventasOtmV2.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.Hibernate;

import javax.persistence.*;

@Entity
//@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Pago {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @JsonFormat(pattern = "yyyy-MM-dd",shape = JsonFormat.Shape.STRING)
    private String fechaPago;

    @JsonFormat(pattern = "yyyy-MM-dd",shape = JsonFormat.Shape.STRING)
    private String fechaDesembolso;


    private double valorPago;
    private double valorPagoNeto;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "factura_id",nullable = false)
    private Factura facturaPago;


    public Pago() {
    }

    public Pago(String fechaPago, String fechaDesembolso, double valorPago, double valorPagoNeto, Factura facturaPago) {
        this.fechaPago = fechaPago;
        this.fechaDesembolso = fechaDesembolso;
        this.valorPago = valorPago;
        this.valorPagoNeto = valorPagoNeto;
        this.facturaPago = facturaPago;
    }

    public String getFechaDesembolso() {
        return fechaDesembolso;
    }

    public void setFechaDesembolso(String fechaDesembolso) {
        this.fechaDesembolso = fechaDesembolso;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFechaPago() {
        return fechaPago;
    }

    public void setFechaPago(String fechaPago) {
        this.fechaPago = fechaPago;
    }

    public double getValorPago() {
        return valorPago;
    }

    public void setValorPago(double valorPago) {
        this.valorPago = valorPago;
    }

    public double getValorPagoNeto() {
        return valorPagoNeto;
    }

    public void setValorPagoNeto(double valorPagoNeto) {
        this.valorPagoNeto = valorPagoNeto;
    }




    public Factura getFacturaPago() {
        return facturaPago;
    }


    public void setFacturaPago(Factura facturaPago) {
        this.facturaPago = facturaPago;
    }

    @Override
    public String toString() {
        return "Pago{" +
                "id=" + id +
                ", fechaPago='" + fechaPago + '\'' +
                ", fechaDesembolso=" + fechaDesembolso +
                ", valorPago=" + valorPago +
                ", valorPagoNeto=" + valorPagoNeto +
                ", facturaPago=" + facturaPago +

                '}';
    }


}
