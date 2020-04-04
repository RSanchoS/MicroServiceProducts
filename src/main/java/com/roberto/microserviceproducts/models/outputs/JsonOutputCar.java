package com.roberto.microserviceproducts.models.outputs;

import java.time.OffsetDateTime;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/** 
 * JsonOutputCarList
 */

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class JsonOutputCar {

    private String modelName;
    private OffsetDateTime realeseDate;
}