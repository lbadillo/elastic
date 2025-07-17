package com.elasticsample.app.service;

import com.elasticsample.app.domain.CarDTO;
import org.springframework.data.domain.Page;

import java.util.List;

public interface ICarService {
    CarDTO getCarById (String id);
    Page<CarDTO> getAllCars(int pageNo, int size);
    CarDTO saveCar(CarDTO car);
    void deleteCar(String id);

}
