package com.example.demo.repository;

import com.example.demo.domain.NotaCredito;
import com.example.demo.entity.BoletaEntity;
import com.example.demo.entity.NotaCreditoEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NotaCreditoRepository extends CrudRepository<NotaCreditoEntity, Long> {

    boolean existById(Long id);
}
