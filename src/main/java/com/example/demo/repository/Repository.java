package com.example.demo.repository;

import com.example.demo.domain.Boleta;
import com.example.demo.entity.BoletaEntity;
import org.springframework.data.repository.CrudRepository;


@org.springframework.stereotype.Repository
public interface Repository extends CrudRepository<BoletaEntity, Long>{

    boolean existById(Long id);

}
