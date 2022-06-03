package com.example.demo.builder.parent;

import java.util.Date;

public abstract class FacturaParent<T, E> {

    private Long idFactura;
    private String producto;
    private int montoFactura;
    private String estadoFactura;
    private Date fechaCre;
    private String usuarioCre;

    public Long getIdFactura() {
        return idFactura;
    }

    public String getProducto() {
        return producto;
    }

    public int getMontoFactura() {
        return montoFactura;
    }

    public String getEstadoFactura() {
        return estadoFactura;
    }

    public Date getFechaCre() {
        return fechaCre;
    }

    public String getUsuarioCre() {
        return usuarioCre;
    }

    public E idFactura(Long idFactura){
        this.idFactura = idFactura;
        return getClassType();
    }

    public E producto(String producto){
        this.producto = producto;
        return getClassType();
    }

    public E montoFactura(int montoFactura){
        this.montoFactura = montoFactura;
        return getClassType();
    }

    public E estadoFactura(String estadoFactura){
        this.estadoFactura = estadoFactura;
        return getClassType();
    }

    public E fechaCre(Date fechaCre){
        this.fechaCre = fechaCre;
        return getClassType();
    }

    public E usuario(String usuarioCre){
        this.usuarioCre = usuarioCre;
        return getClassType();
    }

    public abstract T builder();

    protected abstract E getClassType();
}