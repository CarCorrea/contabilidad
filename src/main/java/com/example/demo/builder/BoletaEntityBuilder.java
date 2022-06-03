package com.example.demo.builder;

import com.example.demo.builder.parent.BoletaParent;
import com.example.demo.entity.BoletaEntity;

public class BoletaEntityBuilder extends BoletaParent<BoletaEntity, BoletaEntityBuilder> {

    public BoletaEntity builder() {
        BoletaEntity entity = new BoletaEntity();
        entity.setIdBoleta(getIdBoleta());
        entity.setProducto(getProducto());
        entity.setMontoBoleta(getMontoBoleta());
        entity.setEstadoBoleta(getEstadoBoleta());
        entity.setFechaCre(getFechaCre());
        entity.setUsuarioCre(getUsuarioCre());
        return entity;
    }

    @Override
    protected BoletaEntityBuilder getClassType() {
        return this;
    }
}
