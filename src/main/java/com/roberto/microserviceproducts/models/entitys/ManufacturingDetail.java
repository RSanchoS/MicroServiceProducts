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
 * ManufactoringDetail
 */
@Entity
@Table(name = "manufacturing_detail")
@Data
@Builder
@ApiModel
public class ManufacturingDetail {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private OffsetDateTime manufacturingDate;

    

}