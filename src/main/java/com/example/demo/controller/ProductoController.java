package com.example.demo.controller;

import com.example.demo.domain.Boleta;
import com.example.demo.domain.Producto;
import com.example.demo.service.ProductoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/producto")
public class ProductoController {

    Logger logger = LoggerFactory.getLogger(ProductoController.class);

    private final ProductoService service;

    public ProductoController(ProductoService service) {
        this.service = service;
    }

    @PostMapping
    public Producto create(@RequestBody Producto producto) {
        logger.info("crear producto");
        return service.create(producto);
    }

    @PutMapping("/{idProducto}")
    public Producto update(@PathVariable("idProducto") Long idProducto, @RequestBody Producto producto){
        logger.info("actualizar producto");
        return service.update(idProducto, producto);
    }

    @GetMapping("/{idProducto}")
    public Producto get(@PathVariable("idProducto") Long idProducto){
        return service.get(idProducto);
    }

    @DeleteMapping("/{idProducto}")
    public boolean delete(@PathVariable("idProducto") Long idProducto){
        logger.info("eliminar producto");
        return service.delete(idProducto);
    }

    @GetMapping
    public List<Producto> all(){
        return service.all();
    }
}
