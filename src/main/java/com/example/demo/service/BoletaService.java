package com.example.demo.service;

import com.example.demo.builder.BoletaBuilder;
import com.example.demo.builder.BoletaEntityBuilder;
import com.example.demo.domain.Boleta;
import com.example.demo.entity.BoletaEntity;
import com.example.demo.repository.BoletaRepository;
import lombok.Data;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Data
@Service
public class BoletaService {

    Logger logger = LoggerFactory.getLogger(BoletaService.class);

    private final BoletaRepository repository;

    public BoletaService(BoletaRepository repository){
        this.repository = repository;
    }

    public Boleta create(Boleta boleta) {
        logger.info("crear boleta");

        BoletaEntity entity = new BoletaEntityBuilder()
                .idBoleta(boleta.getIdBoleta())
                .producto(boleta.getProducto())
                .montoBoleta(boleta.getMontoBoleta())
                .estadoBoleta(boleta.getEstadoBoleta())
                .fechaCre(boleta.getFechaCre())
                .usuario(boleta.getUsuarioCre())
                .builder();

        return buildBoleta(repository.save(entity));
    }

    public Boleta update(Long idBoleta, Boleta boleta){

        BoletaEntity entity = new BoletaEntityBuilder()
                .idBoleta(idBoleta)
                .producto(boleta.getProducto())
                .montoBoleta(boleta.getMontoBoleta())
                .estadoBoleta(boleta.getEstadoBoleta())
                .fechaCre(boleta.getFechaCre())
                .usuario(boleta.getUsuarioCre())
                .builder();

        return  buildBoleta(repository.save(entity));
    }

    public Boleta get(Long idBoleta){
        return buildBoleta(repository.findById(idBoleta).get());
    }

    public boolean delete(Long idBoleta){
        repository.delete(repository.findById(idBoleta).get());
        return true;
    }

    public List<Boleta> all() {
        List<Boleta> listaBoleta = new ArrayList<>();

        repository.findAll().forEach(entity -> listaBoleta.add(buildBoleta(entity)));
        return listaBoleta;
    }

    private Boleta buildBoleta(BoletaEntity entity){
        return new BoletaBuilder()
                .idBoleta(entity.getIdBoleta())
                .producto(entity.getProducto())
                .montoBoleta(entity.getMontoBoleta())
                .estadoBoleta(entity.getEstadoBoleta())
                .usuario(entity.getUsuarioCre())
                .builder();
    }
}
