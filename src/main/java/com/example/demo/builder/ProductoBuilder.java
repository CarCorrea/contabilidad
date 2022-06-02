package com.example.demo.builder;

import com.example.demo.builder.parent.ProductoParent;
import com.example.demo.domain.Producto;

public class ProductoBuilder extends ProductoParent<Producto, ProductoBuilder> {
    @Override
    public Producto builder() {
        Producto producto = new Producto();
        producto.setIdProducto(getIdProducto());
        producto.setNombreProducto(getNombreProducto());
        producto.setPrecio(getPrecio());
        producto.setCantidad(getCantidad());
        return producto;
    }

    @Override
    protected ProductoBuilder getClassType() {
        return this;
    }
}
