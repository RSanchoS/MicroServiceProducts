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
 * TypeEngine
 */
@Entity
@Table(name = "type_engine")
@Data
@Builder
@ApiModel
public class TypeEngine {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    @Column
    private String typeEngineName;
}
