package com.roberto.microserviceproducts.controllers.impl;

import com.roberto.microserviceproducts.controllers.ICardController;
import com.roberto.microserviceproducts.models.outputs.JsonOutputCarList;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

/**
 * CardController
 */
public class CardController implements ICardController {

    @Override
    public ResponseEntity<JsonOutputCarList> getAllCars() {

        return new ResponseEntity<>(null, HttpStatus.OK);
    }

    
}