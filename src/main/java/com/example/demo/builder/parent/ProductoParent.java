package com.example.demo.builder.parent;

public abstract class ProductoParent<T, E> {

    private Long idProducto;
    private String nombreProducto;
    private int precio;
    private int cantidad;

    public Long getIdProducto() {
        return idProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public int getPrecio() {
        return precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public E idProducto(Long idProducto){
        this.idProducto = idProducto;
        return getClassType();
    }

    public E nombreProducto(String nombreProducto){
        this.nombreProducto = nombreProducto;
        return getClassType();
    }

    public E precio(int precio){
        this.precio = precio;
        return getClassType();
    }

    public E cantidad(int cantidad){
        this.cantidad = cantidad;
        return getClassType();
    }

    public abstract T builder();

    protected abstract E getClassType();
}
