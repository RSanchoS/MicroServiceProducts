package com.roberto.microserviceproducts.models.entitys;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import io.swagger.annotations.ApiModel;
import lombok.Builder;
import lombok.Data;

/**
 * Engine
 */
@Entity
@Table(name = "engines")
@Data
@Builder
@ApiModel
public class Engine {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private String engineName;

    @Column
    private Integer cv;

    @Column(name = "id_type_engine")
    private Integer idTypeEngine;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_type_engine", insertable=false, updatable =false)
    @JsonIgnore
    private TypeEngine typeEngine;

    @ManyToMany(mappedBy = "engines")
    private Set<Car> cars;
}