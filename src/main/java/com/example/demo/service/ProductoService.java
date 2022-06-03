package com.example.demo.service;

import com.example.demo.builder.ProductoBuilder;
import com.example.demo.builder.ProductoEntityBuilder;
import com.example.demo.domain.Boleta;
import com.example.demo.domain.Producto;
import com.example.demo.entity.ProductoEntity;
import com.example.demo.repository.ProductoRepository;
import lombok.Data;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Data
@Service
public class ProductoService {

    Logger logger = LoggerFactory.getLogger(ProductoService.class);

    private final ProductoRepository repository;

    public Producto create(Producto producto){
        logger.info("crear producto");

        ProductoEntity entity = new ProductoEntityBuilder()
                .idProducto(producto.getIdProducto())
                .nombreProducto(producto.getNombreProducto())
                .precio(producto.getPrecio())
                .cantidad(producto.getCantidad())
                .builder();

        return buildProducto(repository.save(entity));
    }

    public Producto update(Long idProducto, Producto producto){

        ProductoEntity entity = new ProductoEntityBuilder()
                .idProducto(idProducto)
                .nombreProducto(producto.getNombreProducto())
                .precio(producto.getPrecio())
                .cantidad(producto.getCantidad())
                .builder();

        return buildProducto(repository.save(entity));
    }

    public Producto get(Long idProducto){
        return buildProducto(repository.findById(idProducto).get());
    }

    public boolean delete(Long idProducto){
        repository.delete(repository.findById(idProducto).get());
        return true;
    }

    public List<Producto> all(){
        List<Producto> listaProducto = new ArrayList<>();

        repository.findAll().forEach(entity -> listaProducto.add(buildProducto(entity)));
        return listaProducto;
    }

    private Producto buildProducto(ProductoEntity entity){
        return new ProductoBuilder()
                .idProducto(entity.getIdProducto())
                .nombreProducto(entity.getNombreProducto())
                .precio(entity.getPrecio())
                .cantidad(entity.getCantidad())
                .builder();
    }
}
