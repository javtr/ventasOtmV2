package com.example.ventasOtmV2.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.Set;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Factura {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @JsonFormat(pattern = "yyyy-MM-dd",shape = JsonFormat.Shape.STRING)
    private String fechaCompra;
    private double valorCompra;
    private boolean compraActiva;

    @OneToMany(mappedBy = "facturaCompra",fetch = FetchType.LAZY)
    private Set<Compra> compras;

    @OneToMany(mappedBy = "facturaPago",fetch = FetchType.LAZY)
    private Set<Pago> pagos;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "medioPago_id",nullable = false)
    @JsonIgnore
    private MedioPago medioPagoFactura;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "tipoPago_id",nullable = false)
    @JsonIgnore
    private TipoPago tipoPagoFactura;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cliente_id",nullable = false)
    @JsonIgnore
    private Cliente clienteFactura;


    public Factura() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFechaCompra() {
        return fechaCompra;
    }

    public void setFechaCompra(String fechaCompra) {
        this.fechaCompra = fechaCompra;
    }

    public double getValorCompra() {
        return valorCompra;
    }

    public void setValorCompra(double valorCompra) {
        this.valorCompra = valorCompra;
    }

    public boolean isCompraActiva() {
        return compraActiva;
    }

    public void setCompraActiva(boolean compraActiva) {
        this.compraActiva = compraActiva;
    }

    public Set<Compra> getCompras() {
        return compras;
    }

    public void setCompras(Set<Compra> compras) {
        this.compras = compras;
    }

    public Set<Pago> getPagos() {
        return pagos;
    }

    public void setPagos(Set<Pago> pagos) {
        this.pagos = pagos;
    }

    public MedioPago getMedioPagoFactura() {
        return medioPagoFactura;
    }

    public void setMedioPagoFactura(MedioPago medioPagoFactura) {
        this.medioPagoFactura = medioPagoFactura;
    }

    public TipoPago getTipoPagoFactura() {
        return tipoPagoFactura;
    }

    public void setTipoPagoFactura(TipoPago tipoPagoFactura) {
        this.tipoPagoFactura = tipoPagoFactura;
    }

    public Cliente getClienteFactura() {
        return clienteFactura;
    }

    public void setClienteFactura(Cliente clienteFactura) {
        this.clienteFactura = clienteFactura;
    }

    @Override
    public String toString() {
        return "Factura{" +
                "id=" + id +
                ", fechaCompra='" + fechaCompra + '\'' +
                ", valorCompra=" + valorCompra +
                ", compraActiva=" + compraActiva +
                ", compras=" + compras +
                ", pagos=" + pagos +
                ", medioPagoFactura=" + medioPagoFactura +
                ", tipoPagoFactura=" + tipoPagoFactura +
                ", clienteFactura=" + clienteFactura +
                '}';
    }
}
