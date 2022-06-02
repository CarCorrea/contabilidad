package com.example.demo.service;

import com.example.demo.domain.Boleta;
import com.example.demo.entity.BoletaEntity;
import com.example.demo.repository.Repository;
import lombok.Data;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Data
@org.springframework.stereotype.Service
public class Service {

    Logger logger = LoggerFactory.getLogger(Service.class);

    private final Repository repository;


    public Boleta create(Boleta boleta) {
        logger.info("crear boleta");
        if (repository.existById(boleta.getIdBoleta()){
            throw new BoletaFoundException();
        }

        BoletaEntity entity =
    }
}
