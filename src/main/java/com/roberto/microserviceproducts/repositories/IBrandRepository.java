package com.roberto.microserviceproducts.repositories;

import com.roberto.microserviceproducts.models.entitys.Brand;

import org.springframework.data.repository.CrudRepository;

/**
 * IBrandRepository
 */
public interface IBrandRepository extends CrudRepository<Brand, Integer> {

    
}