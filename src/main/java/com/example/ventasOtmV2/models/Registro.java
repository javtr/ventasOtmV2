package com.example.ventasOtmV2.models;


import java.util.List;
import java.util.Set;

public class Registro {

    private String nombre;
    private String apellido;
    private String correo;

    //@JsonFormat(pattern = "yyyy-MM-dd",shape = JsonFormat.Shape.STRING)
    private String fecha;
    private String medioPago;
    private String tipoPago;
    private Integer cuotas;
    private List<ProductoComprado> productoComprado;

    public Registro(String nombre, String apellido, String correo, String fecha, String medioPago, String tipoPago, Integer cuotas, List<ProductoComprado> productoComprado) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.fecha = fecha;
        this.medioPago = medioPago;
        this.tipoPago = tipoPago;
        this.cuotas = cuotas;
        this.productoComprado = productoComprado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getMedioPago() {
        return medioPago;
    }

    public void setMedioPago(String medioPago) {
        this.medioPago = medioPago;
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

    public List<ProductoComprado> getProductoComprado() {
        return productoComprado;
    }

    public void setProductoComprado(List<ProductoComprado> productoComprado) {
        this.productoComprado = productoComprado;
    }

    @Override
    public String toString() {
        return "Registro{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", correo='" + correo + '\'' +
                ", fecha='" + fecha + '\'' +
                ", medioPago='" + medioPago + '\'' +
                ", tipoPago='" + tipoPago + '\'' +
                ", cuotas=" + cuotas +
                ", productoComprado=" + productoComprado +
                '}';
    }
}



