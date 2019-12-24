package com.roberto.microserviceproducts.controllers;

import java.util.List;

import com.roberto.microserviceproducts.models.outputs.JsonOutputCar;

import org.springframework.http.ResponseEntity;

/**
 * ICardController
 */
public interface ICarController {

    public ResponseEntity<List<JsonOutputCar>> getAllCars();
}