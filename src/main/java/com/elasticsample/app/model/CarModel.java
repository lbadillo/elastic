package com.elasticsample.app.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import java.util.List;

@Data
@Document(indexName = "carindex")
public class CarModel {

    @Id
    private String id;

    @Field(type = FieldType.Text)
    private String model;

    @Field(type = FieldType.Integer, name = "year")
    private Integer yearOfManufacture;

    @Field(type = FieldType.Text)
    private String brand;

    @Field(type = FieldType.Nested)
    private List<OwnerModel> owners;


}
