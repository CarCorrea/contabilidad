package com.example.demo.entity;

import com.example.demo.domain.Producto;
import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Data
@Table(name = "Factura", uniqueConstraints = @UniqueConstraint(columnNames = {"idFactura", "producto", "montoFactura", "estadoFactura", "fechaCre", "usuarioCre"}))
public class FacturaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idFactura;

    @Column(name = "producto", nullable = false, length = 200)
    private String producto;

    @Column(name = "montoFactura", nullable = false, length = 10)
    private int montoFactura;

    @Column(name = "estadoFactura", nullable = false, length = 100)
    private String estadoFactura;

    @Column(name = "idNotaCredito", nullable = true, length = 20)
    private Long idNotaCredito;

    @Column(name = "fechaCre", nullable = false, length = 400)
    private Date fechaCre;

    @Column(name = "usuarioCre", nullable = true, length = 100)
    private String usuarioCre;

    private LocalDateTime creation = LocalDateTime.now();
}
