package com.example.demo.domain;

import lombok.Data;
import java.util.Date;

@Data
public class Boleta {

    private Long idBoleta;
    private Producto producto;
    private int montoBoleta;
    private int estadoBoleta;
    private Date fechaCre;
    private String usuario;
}
