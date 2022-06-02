package com.example.demo.controller;
import com.example.demo.domain.Boleta;
import com.example.demo.service.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/contabilidad")
public class Controller {

    Logger logger = LoggerFactory.getLogger(Controller.class);

    private final Service service;

    public Controller(Service service) {
        this.service = service;
    }

    @PostMapping
    public Boleta create(@RequestBody Boleta boleta){
        logger.info("crear boleta");
        return service.create(boleta);
    }
}
