package com.example.ventasOtmV2.models;


import java.util.List;
import java.util.Set;

public class Registro {

    private Integer clienteid;

    private boolean clienteEx;
    private String nombre;
    private String apellido;
    private String correo;

    private String idMachine;

    private String comentario1;

    private String comentario2;

    //@JsonFormat(pattern = "yyyy-MM-dd",shape = JsonFormat.Shape.STRING)
    private String fecha;
    private String medioPago;
    private String tipoPago;
    private Integer cuotas;
    private List<ProductoComprado> productoComprado;

    public Registro(Integer clienteid, boolean clienteEx, String nombre, String apellido, String correo, String idMachine, String comentario1, String comentario2, String fecha, String medioPago, String tipoPago, Integer cuotas, List<ProductoComprado> productoComprado) {
        this.clienteid = clienteid;
        this.clienteEx = clienteEx;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.idMachine = idMachine;
        this.comentario1 = comentario1;
        this.comentario2 = comentario2;
        this.fecha = fecha;
        this.medioPago = medioPago;
        this.tipoPago = tipoPago;
        this.cuotas = cuotas;
        this.productoComprado = productoComprado;
    }


    public Integer getClienteid() {
        return clienteid;
    }

    public void setClienteid(Integer clienteid) {
        this.clienteid = clienteid;
    }

    public boolean isClienteEx() {
        return clienteEx;
    }

    public void setClienteEx(boolean clienteEx) {
        this.clienteEx = clienteEx;
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

    public String getIdMachine() {
        return idMachine;
    }

    public void setIdMachine(String idMachine) {
        this.idMachine = idMachine;
    }

    public String getComentario1() {
        return comentario1;
    }

    public void setComentario1(String comentario1) {
        this.comentario1 = comentario1;
    }

    public String getComentario2() {
        return comentario2;
    }

    public void setComentario2(String comentario2) {
        this.comentario2 = comentario2;
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
                "clienteid=" + clienteid +
                ", clienteEx=" + clienteEx +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", correo='" + correo + '\'' +
                ", idMachine='" + idMachine + '\'' +
                ", comentario1='" + comentario1 + '\'' +
                ", comentario2='" + comentario2 + '\'' +
                ", fecha='" + fecha + '\'' +
                ", medioPago='" + medioPago + '\'' +
                ", tipoPago='" + tipoPago + '\'' +
                ", cuotas=" + cuotas +
                ", productoComprado=" + productoComprado +
                '}';
    }
}



