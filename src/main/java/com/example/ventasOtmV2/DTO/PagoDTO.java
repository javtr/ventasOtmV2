package com.example.ventasOtmV2.DTO;

import com.fasterxml.jackson.annotation.JsonFormat;

public class PagoDTO {

    private Integer id;

    private String fechaPago;

    private String fechaDesembolso;

    private double valorPago;

    private double valorPagoNeto;

    private String tipoPago;

    private String cliente;

    private Integer facturaActiva;
    private Integer clienteActivo;




    public PagoDTO() {
    }

    public PagoDTO(Integer id, String fechaPago, String fechaDesembolso, double valorPago, double valorPagoNeto, String tipoPago, String cliente, Integer facturaActiva,Integer clienteActivo) {
        this.id = id;
        this.fechaPago = fechaPago;
        this.fechaDesembolso = fechaDesembolso;
        this.valorPago = valorPago;
        this.valorPagoNeto = valorPagoNeto;
        this.tipoPago = tipoPago;
        this.cliente = cliente;
        this.facturaActiva = facturaActiva;
        this.clienteActivo = clienteActivo;
    }

    public PagoDTO(String fechaPago, String fechaDesembolso, double valorPago, double valorPagoNeto, String tipoPago, String cliente, Integer facturaActiva,Integer clienteActivo) {
        this.fechaPago = fechaPago;
        this.fechaDesembolso = fechaDesembolso;
        this.valorPago = valorPago;
        this.valorPagoNeto = valorPagoNeto;
        this.tipoPago = tipoPago;
        this.cliente = cliente;
        this.facturaActiva = facturaActiva;
        this.clienteActivo = clienteActivo;
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

    public String getFechaDesembolso() {
        return fechaDesembolso;
    }

    public void setFechaDesembolso(String fechaDesembolso) {
        this.fechaDesembolso = fechaDesembolso;
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

    public String getTipoPago() {
        return tipoPago;
    }

    public void setTipoPago(String tipoPago) {
        this.tipoPago = tipoPago;
    }

    public String getCliente() {
        return cliente;
    }

    public Integer getFacturaActiva() {
        return facturaActiva;
    }

    public void setFacturaActiva(Integer facturaActiva) {
        this.facturaActiva = facturaActiva;
    }

    public Integer getClienteActivo() {
        return clienteActivo;
    }

    public void setClienteActivo(Integer clienteActivo) {
        this.clienteActivo = clienteActivo;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }
}

