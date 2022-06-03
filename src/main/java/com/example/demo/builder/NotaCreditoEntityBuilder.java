package com.example.demo.builder;

import com.example.demo.builder.parent.NotaCreditoParent;
import com.example.demo.entity.NotaCreditoEntity;

public class NotaCreditoEntityBuilder extends NotaCreditoParent<NotaCreditoEntity, NotaCreditoEntityBuilder> {
    @Override
    public NotaCreditoEntity builder() {
        NotaCreditoEntity entity = new NotaCreditoEntity();
        entity.setIdNotaCredito(getIdNotaCredito());
        entity.setMontoCredito(getMontoCredito());
        entity.setFechaCrea(getFechaCrea());
        entity.setUsuarioCrea(getUsuarioCrea());
        return entity;
    }

    @Override
    protected NotaCreditoEntityBuilder getClassType() {
        return this;
    }
}
