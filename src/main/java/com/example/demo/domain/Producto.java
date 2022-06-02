package com.example.demo.domain;

import lombok.Data;

@Data
public class Producto {

    private int id;
    private String nombreProducto;
    private int precio;
    private int cantidad;
}
