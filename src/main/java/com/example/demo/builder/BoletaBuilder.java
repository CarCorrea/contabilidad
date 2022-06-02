package com.example.demo.builder;

import com.example.demo.builder.parent.BoletaParent;
import com.example.demo.domain.Boleta;
import com.example.demo.entity.BoletaEntity;

public class BoletaBuilder extends BoletaParent<Boleta, BoletaBuilder> {

    public Boleta builder() {
        Boleta boleta = new Boleta();
        boleta.setIdBoleta(getIdBoleta());
        boleta.setProducto(getProducto());
        boleta.setMontoBoleta(getMontoBoleta());
        boleta.setEstadoBoleta(getEstadoBoleta());
        boleta.setFechaCre(getFechaCre());
        boleta.setUsuarioCre(getUsuarioCre());
        return boleta;
    }

    @Override
    protected BoletaBuilder getClassType() {
        return this;
    }

}
