package com.example.ventasOtmV2.models;

import com.example.ventasOtmV2.DTO.PagoDTO;
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

    private String clienteNombre;


    private String tipoPago;

    private Integer facturaIdPago;

    private Integer clienteIdPago;

    private Integer estadoClientePago;

    private Integer estadoFacturaPago;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "factura_id",nullable = false)
    private Factura facturaPago;


    public Pago() {
    }

    public Pago(String fechaPago) {
        this.fechaPago = fechaPago;
    }

    public Pago(String fechaPago, String fechaDesembolso, double valorPago, double valorPagoNeto, Integer estado, String clienteNombre, String tipoPago, Integer facturaIdPago, Integer clienteIdPago, Integer estadoClientePago, Integer estadoFacturaPago, Factura facturaPago) {
        this.fechaPago = fechaPago;
        this.fechaDesembolso = fechaDesembolso;
        this.valorPago = valorPago;
        this.valorPagoNeto = valorPagoNeto;
        this.estado = estado;
        this.clienteNombre = clienteNombre;
        this.tipoPago = tipoPago;
        this.facturaIdPago = facturaIdPago;
        this.clienteIdPago = clienteIdPago;
        this.estadoClientePago = estadoClientePago;
        this.estadoFacturaPago = estadoFacturaPago;
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

    public void setEstado(Integer estado) {
        this.estado = estado;
    }

    public String getTipoPago() {
        return tipoPago;
    }

    public void setTipoPago(String tipoPago) {
        this.tipoPago = tipoPago;
    }

    public Integer getId() {
        return id;
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

    public Integer getFacturaIdPago() {
        return facturaIdPago;
    }

    public void setFacturaIdPago(Integer facturaIdPago) {
        this.facturaIdPago = facturaIdPago;
    }

    public Integer getClienteIdPago() {
        return clienteIdPago;
    }

    public void setClienteIdPago(Integer clienteIdPago) {
        this.clienteIdPago = clienteIdPago;
    }

    public String getClienteNombre() {
        return clienteNombre;
    }

    public void setClienteNombre(String clienteNombre) {
        this.clienteNombre = clienteNombre;
    }

    public Factura getFacturaPago() {
        return facturaPago;
    }


    public void setFacturaPago(Factura facturaPago) {
        this.facturaPago = facturaPago;
    }



    public PagoDTO toDTO(){

        PagoDTO PagoDTO = new PagoDTO();

        PagoDTO.setId(id);

        PagoDTO.setFechaPago(fechaPago);
        PagoDTO.setFechaDesembolso(fechaDesembolso);

        PagoDTO.setValorPago(valorPago);
        PagoDTO.setValorPagoNeto(valorPagoNeto);

        /*
        PagoDTO.setTipoPago(facturaPago.getTipoPagoFactura().getTipoPago());
        PagoDTO.setCliente(
                facturaPago.getClienteFactura().getNombre()+" "+
                facturaPago.getClienteFactura().getApellido()
        );
*/


        PagoDTO.setClienteNombre(clienteNombre);

        PagoDTO.setTipoPago(tipoPago);

        PagoDTO.setFacturaId(facturaIdPago);
        PagoDTO.setClienteId(clienteIdPago);

        PagoDTO.setEstadoPago(estado);

        PagoDTO.setEstadoClientePago(estadoClientePago);
        PagoDTO.setEstadoFacturaPago(estadoFacturaPago);


        return PagoDTO;
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
