package com.example.demo.builder.parent;

import com.example.demo.domain.Producto;

import java.util.Date;

public abstract class BoletaParent<T, E> {

    private Long idBoleta;
    private Producto producto;
    private int montoBoleta;
    private String estadoBoleta;
    private Date fechaCre;
    private String usuarioCre;

    public Long getIdBoleta() {
        return idBoleta;
    }

    public Producto getProducto() {
        return producto;
    }

    public int getMontoBoleta() {
        return montoBoleta;
    }

    public String getEstadoBoleta() {
        return estadoBoleta;
    }

    public Date getFechaCre() {
        return fechaCre;
    }

    public String getUsuarioCre() {
        return usuarioCre;
    }

    public E idBoleta(Long idBoleta){
        this.idBoleta = idBoleta;
        return getClassType();
    }

    public E producto(Producto producto){
        this.producto = producto;
        return getClassType();
    }

    public E montoBoleta(int montoBoleta){
        this.montoBoleta = montoBoleta;
        return getClassType();
    }

    public E estadoBoleta(String estadoBoleta){
        this.estadoBoleta = estadoBoleta;
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
