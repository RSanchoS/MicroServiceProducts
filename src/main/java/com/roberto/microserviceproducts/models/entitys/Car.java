package com.roberto.microserviceproducts.models.entitys;

import java.time.OffsetDateTime;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import io.swagger.annotations.ApiModel;
import lombok.Builder;
import lombok.Data;

/**
 * Car
 */
@Entity
@Table(name = "cars")
@Data
@Builder
@ApiModel
public class Car {



	@Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private String modelName;

    @Column
    private OffsetDateTime releaseDate;

    @Column(name = "id_brand")
    private Integer idBrand;

    @Column(name = "id_type_car")
    private Integer idTypeCar;


    @Column(name = "id_manufacturing_detail")
    private Integer idManufacturingDetail;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_brand", insertable=false, updatable =false)
    @JsonIgnore
    private Brand brand;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_type_car",insertable=false, updatable =false)
    @JsonIgnore
    private TypeCar typeCar;


    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_manufacturing_detail", insertable=false, updatable =false)
    @JsonIgnore
    private ManufacturingDetail manufacturingDetail;

    @ManyToMany
    @JoinTable(name = "car_engine",
        joinColumns = @JoinColumn(name = "id_car"), 
        inverseJoinColumns = @JoinColumn(name = "id_engine"))
    @JsonIgnore
    private Set<Engine> engines;
}