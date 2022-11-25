package com.example.ventasOtmV2.models;

import com.example.ventasOtmV2.DTO.PagoDTO;
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

    private Integer estado;

    private String tipoPagoInsertado;
    private String clienteInsertado;

    private Integer facturaActiva;

    private Integer clienteActivo;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "factura_id",nullable = false)
    private Factura facturaPago;


    public Pago() {
    }

    public Pago(String fechaPago) {
        this.fechaPago = fechaPago;
    }

    public Pago(String fechaPago, String fechaDesembolso, double valorPago, double valorPagoNeto, Integer estado,String tipoPagoInsertado,String clienteInsertado, Factura facturaPago, Integer facturaActiva, Integer clienteActivo) {
        this.fechaPago = fechaPago;
        this.fechaDesembolso = fechaDesembolso;
        this.valorPago = valorPago;
        this.valorPagoNeto = valorPagoNeto;
        this.estado = estado;
        this.tipoPagoInsertado = tipoPagoInsertado;
        this.clienteInsertado = clienteInsertado;
        this.facturaPago = facturaPago;
        this.facturaActiva = facturaActiva;
        this.clienteActivo = clienteActivo;
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

    public String getTipoPagoInsertado() {
        return tipoPagoInsertado;
    }

    public void setTipoPagoInsertado(String tipoPagoInsertado) {
        this.tipoPagoInsertado = tipoPagoInsertado;
    }

    public String getClienteInsertado() {
        return clienteInsertado;
    }

    public void setClienteInsertado(String clienteInsertado) {
        this.clienteInsertado = clienteInsertado;
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

        PagoDTO.setTipoPago(tipoPagoInsertado);
        PagoDTO.setCliente(clienteInsertado);

        PagoDTO.setFacturaActiva(facturaActiva);
        PagoDTO.setClienteActivo(clienteActivo);


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
