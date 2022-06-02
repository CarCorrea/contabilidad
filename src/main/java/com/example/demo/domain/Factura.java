package com.example.demo.domain;

import lombok.Data;
import java.util.Date;

@Data
public class Factura {

    private Long idFactura;
    private Producto producto;
    private int montoFactura;
    private int estadoFactura;
    private Date fechaCre;
    private String usuario;
}
