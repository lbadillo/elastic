package com.elasticsample.app.service.impl;

import com.elasticsample.app.domain.CarDTO;
import com.elasticsample.app.exceptions.MyException;
import com.elasticsample.app.model.CarModel;
import com.elasticsample.app.repository.CarRepository;
import com.elasticsample.app.service.ICarService;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Data
@RequiredArgsConstructor
public class CarService implements ICarService {

    private final CarRepository carRepository;
    private final ModelMapper carMapper;

    @Override
    public CarDTO getCarById(String id) {
        CarModel carM = carRepository
                .findById(id)
                .orElseThrow(() -> new MyException("Car Not found", 1));
        return carMapper.map(carM, CarDTO.class);
    }

    @Override
    public Page<CarDTO> getAllCars(int pageNo, int size) {
        Page<CarModel> pageRes = carRepository
                .findAll(PageRequest.of(pageNo, size));
        return  pageRes.map(carModel -> carMapper.map(carModel, CarDTO.class));
    }

    @Override
    public CarDTO saveCar(CarDTO car) {
         CarModel resTmp = carRepository.save(carMapper.map(car,CarModel.class));
         return carMapper.map(resTmp, CarDTO.class);
    }

    @Override
    public void deleteCar(String id) {
        carRepository.deleteById(id);
    }


}