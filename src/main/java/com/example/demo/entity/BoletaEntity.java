package com.example.demo.entity;

import com.example.demo.domain.Producto;
import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Data
@Table(name = "Boleta", uniqueConstraints = @UniqueConstraint(columnNames = {"idBoleta", "producto", "montoBoleta", "estadoBoleta", "fechaCre", "usuario" }))
public class BoletaEntity {

    @Id
    private Long idBoleta;

    @Column(name = "producto", nullable = false, length = 200)
    private Producto producto;

    @Column(name = "montoBoleta", nullable = false, length = 20)
    private int montoBoleta;

    @Column(name = "estadoBoleta", nullable = false, length = 100)
    private String estadoBoleta;

    @Column(name = "idNotaCredito", nullable = false, length = 20)
    private Long idNotaCredito;

    @Column(name = "fechaCre", nullable = false, length = 40)
    private Date fechaCre;

    @Column(name = "usuarioCre", nullable = true, length = 100)
    private String usuarioCre;

    private LocalDateTime creation = LocalDateTime.now();
}
