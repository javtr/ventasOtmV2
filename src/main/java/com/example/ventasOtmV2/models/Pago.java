package com.example.ventasOtmV2.models;

import com.fasterxml.jackson.annotation.JsonFormat;

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

    private Integer estado;

    private Integer clientePagoId;

    private Integer facturaPagoId;



    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "factura_id",nullable = false)
    private Factura facturaPago;


    public Pago() {
    }

    public Pago(String fechaPago, String fechaDesembolso, double valorPago, double valorPagoNeto, Integer estado, Integer clientePagoId, Integer facturaPagoId, Factura facturaPago) {
        this.fechaPago = fechaPago;
        this.fechaDesembolso = fechaDesembolso;
        this.valorPago = valorPago;
        this.valorPagoNeto = valorPagoNeto;
        this.estado = estado;
        this.clientePagoId = clientePagoId;
        this.facturaPagoId = facturaPagoId;
        this.facturaPago = facturaPago;
    }

    public Pago(Integer id, Integer estado) {
        this.id = id;
        this.estado = estado;
    }

    public String getFechaDesembolso() {
        return fechaDesembolso;
    }

    public void setFechaDesembolso(String fechaDesembolso) {
        this.fechaDesembolso = fechaDesembolso;
    }

    public Integer getEstado() {
        return estado;
    }

    public Integer getClientePagoId() {
        return clientePagoId;
    }

    public void setClientePagoId(Integer clientePagoId) {
        this.clientePagoId = clientePagoId;
    }

    public Integer getFacturaPagoId() {
        return facturaPagoId;
    }

    public void setFacturaPagoId(Integer facturaPagoId) {
        this.facturaPagoId = facturaPagoId;
    }

    public void setEstado(Integer estado) {
        this.estado = estado;
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
                ", estado=" + estado +
                ", facturaPago=" + facturaPago +
                '}';
    }


}
