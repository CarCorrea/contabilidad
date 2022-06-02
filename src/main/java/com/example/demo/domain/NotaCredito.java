package com.example.demo.domain;

import lombok.Data;
import java.util.Date;

@Data
public class NotaCredito {

    private Long id;
    private int montoCredito;
    private Date fechaCrea;
    private String usuario;
}
