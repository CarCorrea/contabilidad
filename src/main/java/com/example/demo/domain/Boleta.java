package com.example.demo.domain;

import lombok.Data;

@Data
public class Boleta {

    private Long idBoleta;
    private String producto;
    private int montoBoleta;
    private String estadoBoleta;
    private String fechaCre;
    private String usuarioCre;
}
