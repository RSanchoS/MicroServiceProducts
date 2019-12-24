package com.roberto.microserviceproducts.repositories;

import com.roberto.microserviceproducts.models.entitys.Engine;

import org.springframework.data.repository.CrudRepository;

/**
 * IEngineRepository
 */
public interface IEngineRepository extends CrudRepository<Engine, Integer> {

    
}