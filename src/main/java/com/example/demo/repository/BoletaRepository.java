package com.example.demo.repository;


import com.example.demo.entity.BoletaEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface BoletaRepository extends CrudRepository<BoletaEntity, Long>{

    //boolean existById(Long id);
}
