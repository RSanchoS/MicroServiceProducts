package com.roberto.microserviceproducts.controllers.impl;

import java.util.List;
import java.util.stream.Collectors;

import com.roberto.microserviceproducts.controllers.ICarController;
import com.roberto.microserviceproducts.mappers.ICarMapper;
import com.roberto.microserviceproducts.models.entitys.Car;
import com.roberto.microserviceproducts.models.outputs.JsonOutputCar;
import com.roberto.microserviceproducts.repositories.ICarRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * CardController
 */
@RestController
@RequestMapping("/cars")
@Api
public class CarController implements ICarController {

    @Autowired
    private ICarRepository carRepository;


    @Override
    @GetMapping("/all")
    @ApiOperation(value = "Find all cars")
    public ResponseEntity<List<JsonOutputCar>> getAllCars() {

        try {

            List<Car> lcars = (List<Car>) carRepository.findAll();

            if (lcars.size() <= 0 || lcars == null) new ResponseEntity<>(HttpStatus.NO_CONTENT);

            List<JsonOutputCar> lresult = lcars.stream().map(car -> ICarMapper.INSTANCE.carToJsonOutputCar(car)).collect(Collectors.toList());

            return new ResponseEntity<>(lresult, HttpStatus.OK);

        } catch (Exception e) {

            new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }

        return null;
    }

}