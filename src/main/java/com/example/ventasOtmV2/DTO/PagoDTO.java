package com.example.ventasOtmV2.DTO;

public class PagoDTO {

    private Integer id;

    private String fechaPago;

    private String fechaDesembolso;

    private double valorPago;

    private double valorPagoNeto;

    private String tipoPago;

    private String clienteNombre;


    private Integer facturaId;
    private Integer clienteId;


    private Integer estadoPago;

    private Integer estadoClientePago;

    private Integer estadoFacturaPago;






    public PagoDTO() {
    }

    public PagoDTO(String fechaPago, String fechaDesembolso, double valorPago, double valorPagoNeto, String tipoPago, String clienteNombre, Integer facturaId, Integer clienteId, Integer estadoPago, Integer estadoClientePago, Integer estadoFacturaPago) {
        this.fechaPago = fechaPago;
        this.fechaDesembolso = fechaDesembolso;
        this.valorPago = valorPago;
        this.valorPagoNeto = valorPagoNeto;
        this.tipoPago = tipoPago;
        this.clienteNombre = clienteNombre;
        this.facturaId = facturaId;
        this.clienteId = clienteId;
        this.estadoPago = estadoPago;
        this.estadoClientePago = estadoClientePago;
        this.estadoFacturaPago = estadoFacturaPago;
    }


    public PagoDTO(Integer id, String fechaPago, String fechaDesembolso, double valorPago, double valorPagoNeto, String tipoPago, String clienteNombre, Integer facturaId, Integer clienteId, Integer estadoPago, Integer estadoClientePago, Integer estadoFacturaPago) {
        this.id = id;
        this.fechaPago = fechaPago;
        this.fechaDesembolso = fechaDesembolso;
        this.valorPago = valorPago;
        this.valorPagoNeto = valorPagoNeto;
        this.tipoPago = tipoPago;
        this.clienteNombre = clienteNombre;
        this.facturaId = facturaId;
        this.clienteId = clienteId;
        this.estadoPago = estadoPago;
        this.estadoClientePago = estadoClientePago;
        this.estadoFacturaPago = estadoFacturaPago;
    }

    public Integer getId() {
        return id;
    }

    public Integer getEstadoPago() {
        return estadoPago;
    }

    public void setEstadoPago(Integer estadoPago) {
        this.estadoPago = estadoPago;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFechaPago() {
        return fechaPago;
    }

    public Integer getEstadoClientePago() {
        return estadoClientePago;
    }

    public void setEstadoClientePago(Integer estadoClientePago) {
        this.estadoClientePago = estadoClientePago;
    }

    public Integer getEstadoFacturaPago() {
        return estadoFacturaPago;
    }

    public void setEstadoFacturaPago(Integer estadoFacturaPago) {
        this.estadoFacturaPago = estadoFacturaPago;
    }

    public void setFechaPago(String fechaPago) {
        this.fechaPago = fechaPago;
    }

    public String getFechaDesembolso() {
        return fechaDesembolso;
    }

    public String getClienteNombre() {
        return clienteNombre;
    }

    public void setClienteNombre(String clienteNombre) {
        this.clienteNombre = clienteNombre;
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

    public Integer getFacturaId() {
        return facturaId;
    }

    public void setFacturaId(Integer facturaId) {
        this.facturaId = facturaId;
    }

    public Integer getClienteId() {
        return clienteId;
    }

    public void setClienteId(Integer clienteId) {
        this.clienteId = clienteId;
    }




}

