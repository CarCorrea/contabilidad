package com.example.demo.controller;

import com.example.demo.domain.Boleta;
import com.example.demo.domain.NotaCredito;
import com.example.demo.service.NotaCreditoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/NotaCredito")
public class NotaCreditoController {

    Logger logger = LoggerFactory.getLogger(NotaCreditoController.class);

    private final NotaCreditoService service;

    public NotaCreditoController(NotaCreditoService service) {
        this.service = service;
    }

    @PostMapping
    public NotaCredito create(@RequestBody NotaCredito notaCredito){
        logger.info("crear nota de credito");
        return service.create(notaCredito);
    }

    @PutMapping("/idNotaCredito")
    public NotaCredito update(@PathVariable("idNotaCredito") Long idNotaCredito, @RequestBody NotaCredito notaCredito){
        logger.info("actualizar nota de credito");
        return service.update(idNotaCredito, notaCredito);
    }

    @GetMapping("/idNotaCredito")
    public NotaCredito get(@PathVariable("idNotaCredito") Long idNotaCredito){
        return service.get(idNotaCredito);
    }

    @DeleteMapping("/idNotaCredito")
    public boolean delete(@PathVariable("idNotaCredito") Long idNotaCredito){
        return service.delete(idNotaCredito);
    }

    @GetMapping
    public List<NotaCredito> all(){
        return service.all();
    }
}
