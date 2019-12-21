package com.roberto.repositories;

import com.roberto.microserviceproducts.models.entitys.Car;

import org.springframework.data.repository.CrudRepository;

/**
 * ICarRepository
 */
public interface ICarRepository extends CrudRepository<Car, Integer> {

}