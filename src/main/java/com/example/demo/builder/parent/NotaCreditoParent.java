package com.example.demo.builder.parent;

import java.util.Date;

public abstract class NotaCreditoParent<T, E> {

    private Long idNotaCredito;
    private int montoCredito;
    private Date fechaCrea;
    private String usuarioCrea;

    public Long getIdNotaCredito() {
        return idNotaCredito;
    }

    public int getMontoCredito() {
        return montoCredito;
    }

    public Date getFechaCrea() {
        return fechaCrea;
    }

    public String getUsuarioCrea() {
        return usuarioCrea;
    }

    public E idNotaCredito(Long idNotaCredito){
        this.idNotaCredito = idNotaCredito;
        return getClassType();
    }

    public E montoCredito(int montoCredito){
        this.montoCredito = montoCredito;
        return getClassType();
    }

    public E fechaCrea(Date fechaCrea){
        this.fechaCrea = fechaCrea;
        return getClassType();
    }

    public E usuarioCrea(String usuarioCrea){
        this.usuarioCrea = usuarioCrea;
        return getClassType();
    }

    public abstract T builder();

    protected abstract E getClassType();
}
