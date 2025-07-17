package com.elasticsample.app.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class CarDTO {

    private String id;
    private String model;
    private Integer year;
    private String brand;
    private String yearBrand;
    private List<OwnerDTO> owners;
}
