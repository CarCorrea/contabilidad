package com.example.demo.builder;

import com.example.demo.builder.parent.NotaCreditoParent;
import com.example.demo.domain.NotaCredito;

public class NotaCreditoBuilder extends NotaCreditoParent<NotaCredito, NotaCreditoBuilder> {

    @Override
    public NotaCredito builder() {
        NotaCredito notaCredito = new NotaCredito();
        notaCredito.setIdNotaCredito(getIdNotaCredito());
        notaCredito.setMontoCredito(getMontoCredito());
        notaCredito.setFechaCrea(getFechaCrea());
        notaCredito.setUsuarioCrea(getUsuarioCrea());
        return notaCredito;
    }

    @Override
    protected NotaCreditoBuilder getClassType() {
        return this;
    }
}
