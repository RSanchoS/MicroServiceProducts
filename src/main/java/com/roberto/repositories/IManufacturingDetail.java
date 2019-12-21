package com.roberto.repositories;

import com.roberto.microserviceproducts.models.entitys.ManufacturingDetail;

import org.springframework.data.repository.CrudRepository;

/**
 * IManufacturingDetail
 */
public interface IManufacturingDetail extends CrudRepository<ManufacturingDetail, Integer> {

    
}