package com.roberto.microserviceproducts.controllers.impl;

import java.util.Collections;
import java.util.List;

import com.roberto.microserviceproducts.controllers.ICarController;
import com.roberto.microserviceproducts.models.outputs.JsonOutputCar;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

/**
 * CardController
 */
public class CarController implements ICarController {

    @Override
    public ResponseEntity<List<JsonOutputCar>> getAllCars() {
        
        return new ResponseEntity<>(Collections.emptyList(), HttpStatus.OK);
    }



    
}