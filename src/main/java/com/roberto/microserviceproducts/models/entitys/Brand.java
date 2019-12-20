package com.roberto.microserviceproducts.models.entitys;

import java.time.OffsetDateTime;

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
 * Brand
 */
@Entity
@Table(name = "brands")
@Data
@Builder
@ApiModel
public class Brand {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    @Column
    private String brandName;
    
    @Column
    private OffsetDateTime foundationDate;

    
}