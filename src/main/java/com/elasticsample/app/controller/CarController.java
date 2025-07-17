package com.elasticsample.app.controller;

import com.elasticsample.app.domain.CarDTO;
import com.elasticsample.app.service.ICarService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/car")
public class CarController {

    private final ICarService service;

    @PostMapping
    public CarDTO save(@RequestBody CarDTO carDTO) {
        return service.saveCar(carDTO);

    }

    @GetMapping("/{id}")
    public CarDTO findById(@PathVariable String id) {
        return service.getCarById(id);
    }

    @GetMapping
    public Page<CarDTO> findAll(@RequestParam int pageNo, @RequestParam int size) {
        return service.getAllCars(pageNo, size);


    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable String id) {
        service.deleteCar(id);

    }

    @PutMapping
    public CarDTO update(@RequestBody CarDTO car) {
        return service.saveCar(car);

    }
}
