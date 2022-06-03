package com.example.demo.entity;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Data
@Table(name = "Boleta", uniqueConstraints = @UniqueConstraint(columnNames = {"idBoleta", "producto", "montoBoleta", "estadoBoleta", "fechaCre", "usuarioCre" }))
public class BoletaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idBoleta;

    @Column(name = "producto", nullable = false, length = 200)
    private String producto;

    @Column(name = "montoBoleta", nullable = false, length = 20)
    private int montoBoleta;

    @Column(name = "estadoBoleta", nullable = false, length = 100)
    private String estadoBoleta;

    @Column(name = "idNotaCredito", nullable = true, length = 20)
    private Long idNotaCredito;

    @Column(name = "fechaCre", nullable = false, length = 40)
    private String fechaCre;

    @Column(name = "usuarioCre", nullable = true, length = 100)
    private String usuarioCre;

    private LocalDateTime creation = LocalDateTime.now();
}
