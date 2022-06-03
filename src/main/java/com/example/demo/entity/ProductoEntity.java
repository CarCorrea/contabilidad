package com.example.demo.entity;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Data
@Table(name = "Producto", uniqueConstraints = @UniqueConstraint(columnNames = {"idProducto", "nombreProducto", "precio", "cantidad"}))
public class ProductoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idProducto;

    @Column(name = "nombreProducto", nullable = false, length = 200)
    private String nombreProducto;

    @Column(name = "precio", nullable = false, length = 20)
    private int precio;

    @Column(name = "cantidad", nullable = false, length = 20)
    private int cantidad;

    private LocalDateTime creation = LocalDateTime.now();
}
