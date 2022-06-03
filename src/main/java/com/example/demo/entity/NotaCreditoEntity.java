package com.example.demo.entity;

import com.example.demo.domain.Boleta;
import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Data
@Table(name = "NotaCredito", uniqueConstraints = @UniqueConstraint(columnNames = {"idNotaCredito", "montoCredito", "fechaCrea", "usuarioCrea"}))
public class NotaCreditoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idNotaCredito;

    @Column(name = "montoCredito", nullable = false, length = 20)
    private int montoCredito;

    @Column(name = "fechaCrea", nullable = false, length = 40)
    private Date fechaCrea;

    @Column(name = "usuarioCrea", nullable = true, length = 100)
    private String usuarioCrea;

    private LocalDateTime creation = LocalDateTime.now();

}
