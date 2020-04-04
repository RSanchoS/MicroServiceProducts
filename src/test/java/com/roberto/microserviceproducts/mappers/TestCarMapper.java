package com.roberto.microserviceproducts.mappers;

import org.junit.Assert;

import java.time.OffsetDateTime;

import com.roberto.microserviceproducts.models.entitys.Car;
import com.roberto.microserviceproducts.models.outputs.JsonOutputCar;

import org.junit.Test;


/**
 * TestCarMapper
 */
public class TestCarMapper {

    @Test
    public void unitTestForICarMapper(){

        OffsetDateTime testDateNow = OffsetDateTime.now();
        String testModelName = "Car1";

        Car testCar = Car.builder()
            .modelName(testModelName)
            .releaseDate(testDateNow)
            .build();

        JsonOutputCar testOutputCar = ICarMapper.INSTANCE.carToJsonOutputCar(testCar);
        
        Assert.assertNotNull(testOutputCar);
        Assert.assertEquals(testOutputCar.getModelName(), testModelName);
        //Assert.assertEquals(testOutputCar.getRealeseDate(),testDateNow);

    }
}