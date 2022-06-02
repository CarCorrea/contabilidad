package com.example.demo.domain;

import lombok.Data;
import java.util.Date;

@Data
public class NotaCredito {

    private int id;
    private Date fechaCrea;
    private String usuario;
    private Boleta boleta;
    private int montoCredito;
}
