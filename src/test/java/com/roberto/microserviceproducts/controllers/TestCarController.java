package com.roberto.microserviceproducts.controllers;

import java.util.ArrayList;
import java.util.List;

import com.roberto.microserviceproducts.controllers.impl.CardController;
import com.roberto.microserviceproducts.models.entitys.Car;
import com.roberto.microserviceproducts.models.outputs.JsonOutputCarList;
import com.roberto.repositories.ICarRepository;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest()
public class TestCarController {

    @InjectMocks
    private CardController carController;

    @Mock
    private ICarRepository carRepository;

    @Before
    private void setUp() {

        MockitoAnnotations.initMocks(this);

    }

    @Test
    private void unitTestForGetAllCars() {

    List<Car> lCars = new ArrayList<>();

    List<JsonOutputCarList> resultList = new ArrayList<>();

    Mockito.when(carRepository.findAll()).thenReturn(lCars);

    ResponseEntity<JsonOutputCarList> httpResponse = carController.getAllCars();

    Assert.assertNotNull(httpResponse.getBody());
    Assert.assertEquals(httpResponse.getStatusCode(), HttpStatus.OK);
}

@After
private void afterTest(){
    
}

}