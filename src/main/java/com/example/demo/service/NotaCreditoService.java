package com.example.demo.service;

import com.example.demo.builder.NotaCreditoBuilder;
import com.example.demo.builder.NotaCreditoEntityBuilder;
import com.example.demo.domain.NotaCredito;
import com.example.demo.entity.NotaCreditoEntity;
import com.example.demo.repository.NotaCreditoRepository;
import lombok.Data;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Data
@Service
public class NotaCreditoService {

    Logger logger = LoggerFactory.getLogger(NotaCreditoService.class);

    private final NotaCreditoRepository repository;

    public NotaCreditoService(NotaCreditoRepository repository){
        this.repository = repository;
    }

    public NotaCredito create(NotaCredito notaCredito) {
        logger.info("crear nota de credito");

        NotaCreditoEntity entity = new NotaCreditoEntityBuilder()
                .idNotaCredito(notaCredito.getIdNotaCredito())
                .montoCredito(notaCredito.getMontoCredito())
                .fechaCrea(notaCredito.getFechaCrea())
                .usuarioCrea(notaCredito.getUsuarioCrea())
                .builder();

        return buildNotaCredito(repository.save(entity));
    }

    public NotaCredito update(Long idNotaCredito, NotaCredito notaCredito){

        NotaCreditoEntity entity = new NotaCreditoEntityBuilder()
                .idNotaCredito(idNotaCredito)
                .montoCredito(notaCredito.getMontoCredito())
                .fechaCrea(notaCredito.getFechaCrea())
                .usuarioCrea(notaCredito.getUsuarioCrea())
                .builder();

        return buildNotaCredito(repository.save(entity));
    }

    public NotaCredito get(Long idNotaCredito){
        return buildNotaCredito(repository.findById(idNotaCredito).get());
    }

    public boolean delete(Long idNotaCredito){
        repository.delete(repository.findById(idNotaCredito).get());
        return true;
    }

    public List<NotaCredito> all() {
        List<NotaCredito> listaNotaCredito = new ArrayList<>();

        repository.findAll().forEach(entity -> listaNotaCredito.add(buildNotaCredito(entity)));
        return listaNotaCredito;
    }


    private NotaCredito buildNotaCredito(NotaCreditoEntity entity){
        return new NotaCreditoBuilder()
                .idNotaCredito(entity.getIdNotaCredito())
                .montoCredito(entity.getMontoCredito())
                .fechaCrea(entity.getFechaCrea())
                .usuarioCrea(entity.getUsuarioCrea())
                .builder();
    }
}
