package com.roberto.microserviceproducts.controllers;

import java.util.ArrayList;
import java.util.List;

import com.roberto.microserviceproducts.controllers.impl.CarController;
import com.roberto.microserviceproducts.mappers.ICarMapper;
import com.roberto.microserviceproducts.models.entitys.Car;
import com.roberto.microserviceproducts.models.outputs.JsonOutputCar;
import com.roberto.microserviceproducts.repositories.ICarRepository;

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
    private CarController carController;

    @Mock
    private ICarRepository carRepository;

    @Mock
    private ICarMapper carMapper;

    @Before
    public void setUp() {

        MockitoAnnotations.initMocks(this);

    }

    @Test
    public void unitTestForGetAllCars() {

    List<Car> lCars = new ArrayList<>();
    lCars.add(Car.builder().build());
    lCars.add(Car.builder().build());

    Mockito.when(carRepository.findAll()).thenReturn(lCars);
    Mockito.when(carMapper.INSTANCE.carToJsonOutputCar(lCars.get(0))).thenReturn(JsonOutputCar.builder().build());
    Mockito.when(carMapper.INSTANCE.carToJsonOutputCar(lCars.get(1))).thenReturn(JsonOutputCar.builder().build());

    ResponseEntity<List<JsonOutputCar>> httpResponse = carController.getAllCars();

    Assert.assertNotNull(httpResponse.getBody());
    Assert.assertEquals(httpResponse.getStatusCode(), HttpStatus.OK);
    Assert.assertEquals(lCars.size(), httpResponse.getBody().size());
}


}