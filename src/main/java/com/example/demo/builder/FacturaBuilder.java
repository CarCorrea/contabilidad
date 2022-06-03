package com.example.demo.builder;

import com.example.demo.builder.parent.FacturaParent;
import com.example.demo.domain.Factura;
import com.example.demo.entity.FacturaEntity;

public class FacturaBuilder extends FacturaParent<Factura, FacturaBuilder> {

    public Factura builder() {
        Factura factura = new Factura();
        factura.setIdFactura(getIdFactura());
        factura.setProducto(getProducto());
        factura.setMontoFactura(getMontoFactura());
        factura.setEstadoFactura(getEstadoFactura());
        factura.setFechaCre(getFechaCre());
        factura.setUsuarioCre(getUsuarioCre());
        return factura;
    }

    @Override
    protected FacturaBuilder getClassType() {
        return this;
    }
}