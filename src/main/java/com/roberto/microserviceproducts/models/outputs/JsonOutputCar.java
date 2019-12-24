package com.roberto.microserviceproducts.models.outputs;

import java.time.OffsetDateTime;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

/**
 * JsonOutputCarList
 */
@Builder
@Getter
@Setter
public class JsonOutputCar {

    private String modelName;
    private OffsetDateTime realeseDate;
    private String brandName;
}