package com.roberto.microserviceproducts.mappers;

import com.roberto.microserviceproducts.models.entitys.Car;
import com.roberto.microserviceproducts.models.outputs.JsonOutputCar;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

/**
 * CarMapper
 */
@Mapper
public interface ICarMapper {

    ICarMapper INSTANCE = Mappers.getMapper(ICarMapper.class);

    @Mapping(source = "modelName", target = "modelName")
    @Mapping(source = "releaseDate", target = "releaseDate")
    @Mapping(source = "brand.brandName", target = "brandName")
    JsonOutputCar carToJsonOutputCar(Car car);
}