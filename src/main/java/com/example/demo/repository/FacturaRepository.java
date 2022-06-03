package com.example.demo.repository;

import com.example.demo.entity.BoletaEntity;
import com.example.demo.entity.FacturaEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FacturaRepository extends CrudRepository<FacturaEntity, Long> {

    //boolean existById(Long id);
}
