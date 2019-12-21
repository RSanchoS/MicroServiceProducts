package com.roberto.repositories;

import com.roberto.microserviceproducts.models.entitys.TypeCar;

import org.springframework.data.repository.CrudRepository;

/**
 * ITypeCar
 */
public interface ITypeCar extends CrudRepository<TypeCar, Integer>{

    
}