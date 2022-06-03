package com.example.demo.builder.parent;

public abstract class BoletaParent<T, E> {

    private Long idBoleta;
    private String producto;
    private int montoBoleta;
    private String estadoBoleta;
    private String fechaCre;
    private String usuarioCre;

    public Long getIdBoleta() {
        return idBoleta;
    }

    public String getProducto() {
        return producto;
    }

    public int getMontoBoleta() {
        return montoBoleta;
    }

    public String getEstadoBoleta() {
        return estadoBoleta;
    }

    public String getFechaCre() {
        return fechaCre;
    }

    public String getUsuarioCre() {
        return usuarioCre;
    }

    public E idBoleta(Long idBoleta){
        this.idBoleta = idBoleta;
        return getClassType();
    }

    public E producto(String producto){
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

    public E fechaCre(String fechaCre){
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
