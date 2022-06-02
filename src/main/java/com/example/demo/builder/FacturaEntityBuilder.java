package com.example.demo.builder;

import com.example.demo.builder.parent.FacturaParent;
import com.example.demo.entity.FacturaEntity;

public class FacturaEntityBuilder extends FacturaParent<FacturaEntity, FacturaEntityBuilder> {

    public FacturaEntity builder() {
        FacturaEntity entity = new FacturaEntity();
        entity.setIdFactura(getIdFactura());
        entity.setProducto(getProducto());
        entity.setMontoFactura(getMontoFactura());
        entity.setEstadoFactura(getEstadoFactura());
        entity.setFechaCre(getFechaCre());
        entity.setUsuarioCre(getUsuarioCre());
        return entity;
    }

    @Override
    protected FacturaEntityBuilder getClassType() {
        return this;
    }
}