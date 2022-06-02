package com.example.demo.controller;
import com.example.demo.domain.Boleta;
import com.example.demo.service.BoletaService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/boleta")
public class BoletaController {

    Logger logger = LoggerFactory.getLogger(BoletaController.class);

    private final BoletaService service;

    public BoletaController(BoletaService service) {
        this.service = service;
    }

    @PostMapping
    public Boleta create(@RequestBody Boleta boleta){
        logger.info("crear boleta");
        return service.create(boleta);
    }

    @PutMapping("/{idBoleta}")
    public Boleta update(@PathVariable("idBoleta") Long idBoleta, @RequestBody Boleta boleta){
        logger.info("actualizar boleta");
        return service.update(idBoleta, boleta);
    }

    @GetMapping("/{idBoleta}")
    public Boleta get(@PathVariable("idBoleta") Long idBoleta){
        return service.get(idBoleta);
    }

    @DeleteMapping("/{idBoleta}")
    public boolean delete(@PathVariable("idBoleta") Long idBoleta){

        return service.delete(idBoleta);
    }

    @GetMapping
    public List<Boleta> all(){
        return service.all();
    }

}
