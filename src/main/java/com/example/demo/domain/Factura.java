package com.example.demo.domain;

import lombok.Data;
import java.util.Date;

@Data
public class Factura {

    private Long idFactura;
    private Producto producto;
    private int montoFactura;
    private String estadoFactura;
    private Date fechaCre;
    private String usuarioCre;
}
