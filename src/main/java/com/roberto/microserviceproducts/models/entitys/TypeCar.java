package com.roberto.microserviceproducts.models.entitys;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import io.swagger.annotations.ApiModel;
import lombok.Builder;
import lombok.Data;

/**
 * TypeCard
 */
@Entity
@Table(name = "type_car")
@Data
@Builder
@ApiModel
public class TypeCar {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    @Column
    private String typeCardName;
}