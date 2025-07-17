package com.elasticsample.app.config;

import com.elasticsample.app.domain.CarDTO;
import com.elasticsample.app.model.CarModel;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeMap;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigMapper {

    @Bean
    public ModelMapper carMapper () {
        ModelMapper carMapper = new ModelMapper();

        TypeMap<CarDTO, CarModel> typeMap = carMapper.createTypeMap( CarDTO.class, CarModel.class);
        typeMap.addMappings(mapper -> {
            mapper.map(CarDTO::getYear,
                    CarModel::setYearOfManufacture);
        });
        return carMapper;
    }
}
