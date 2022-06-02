package com.example.demo.service;

import com.example.demo.builder.FacturaBuilder;
import com.example.demo.builder.FacturaEntityBuilder;
import com.example.demo.domain.Boleta;
import com.example.demo.domain.Factura;
import com.example.demo.entity.FacturaEntity;
import com.example.demo.repository.BoletaRepository;
import com.example.demo.repository.FacturaRepository;
import lombok.Data;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Data
@Service
public class FacturaService {

    Logger logger = LoggerFactory.getLogger(BoletaService.class);

    private final FacturaRepository repository;

    public Factura create(Factura factura){
        logger.info("create factura");

        FacturaEntity entity = new FacturaEntityBuilder()
                .idFactura(factura.getIdFactura())
                .producto(factura.getProducto())
                .montoFactura(factura.getMontoFactura())
                .estadoFactura(factura.getEstadoFactura())
                .fechaCre(factura.getFechaCre())
                .usuario(factura.getUsuarioCre())
                .builder();

        return buildFactura(repository.save(entity));
    }

    public Factura update(Long idFactura, Factura factura){

        FacturaEntity entity = new FacturaEntityBuilder()
                .idFactura(idFactura)
                .producto(factura.getProducto())
                .montoFactura(factura.getMontoFactura())
                .estadoFactura(factura.getEstadoFactura())
                .fechaCre(factura.getFechaCre())
                .usuario(factura.getUsuarioCre())
                .builder();

        return buildFactura(repository.save(entity));
    }

    public Factura get(Long idFactura){
        return buildFactura(repository.findById(idFactura).get());
    }

    public boolean delete(Long idFactura){
        repository.delete(repository.findById(idFactura).get());
        return true;
    }

    public List<Factura> all() {
        List<Factura> listaFactura = new ArrayList<>();

        repository.findAll().forEach(entity -> listaFactura.add(buildFactura(entity)));
        return listaFactura;
    }

    private Factura buildFactura(FacturaEntity entity){
        return new FacturaBuilder()
                .idFactura(entity.getIdFactura())
                .producto(entity.getProducto())
                .montoFactura(entity.getMontoFactura())
                .estadoFactura(entity.getEstadoFactura())
                .usuario(entity.getUsuarioCre())
                .builder();
    }
}
