package com.example.demo.builder;

import com.example.demo.builder.parent.NotaCreditoParent;
import com.example.demo.builder.parent.ProductoParent;
import com.example.demo.entity.NotaCreditoEntity;
import com.example.demo.entity.ProductoEntity;

public class ProductoEntityBuilder extends ProductoParent<ProductoEntity, ProductoEntityBuilder> {

    @Override
    public ProductoEntity builder() {
        ProductoEntity entity = new ProductoEntity();
        entity.setIdProducto(getIdProducto());
        entity.setNombreProducto(getNombreProducto());
        entity.setPrecio(getPrecio());
        entity.setCantidad(getCantidad());
        return entity;
    }

    @Override
    protected ProductoEntityBuilder getClassType() {
        return this;
    }
}
