package com.example.demo.controller;

import com.example.demo.domain.Boleta;
import com.example.demo.domain.Factura;
import com.example.demo.service.FacturaService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/factura")
public class FacturaController {

    Logger logger = LoggerFactory.getLogger(FacturaController.class);

    private final FacturaService service;

    public FacturaController(FacturaService service) {
        this.service = service;
    }

    @PostMapping
    public Factura create(@RequestBody Factura factura){
        logger.info("crear Factura");
        return service.create(factura);
    }

    @PutMapping("/{idFactura}")
    public Factura update(@PathVariable("idFactura") Long idFactura, @RequestBody Factura factura){
        logger.info("actualizar factura");
        return service.update(idFactura, factura);
    }

    @GetMapping("/{idFactura}")
    public Factura get(@PathVariable("idFactura") Long idFactura){
        return service.get(idFactura);
    }

    @DeleteMapping("/{idFactura}")
    public boolean delete(@PathVariable("idFactura") Long idFactura){

        return service.delete(idFactura);
    }

    @GetMapping
    public List<Factura> all(){
        return service.all();
    }
}
