package com.roberto.microserviceproducts.controllers;

import com.roberto.microserviceproducts.models.outputs.JsonOutputCarList;

import org.springframework.http.ResponseEntity;

/**
 * ICardController
 */
public interface ICardController {

    public ResponseEntity<JsonOutputCarList> getAllCars();
}