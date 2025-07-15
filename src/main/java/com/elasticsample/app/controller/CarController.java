package com.elasticsample.app.controller;

import com.elasticsample.app.model.CarModel;
import com.elasticsample.app.repository.CarRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
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
    private final CarRepository carRepository;

    @PostMapping
    public void save(@RequestBody CarModel carModel) {
        carRepository.save(carModel);

    }

    @GetMapping("/{id}")
    public CarModel findById(@PathVariable String id) {
        return carRepository.findById(id).orElse(null);

    }

    @GetMapping
    public Page<CarModel> findAll(@RequestParam int pageNo, @RequestParam int size) {
        return carRepository.findAll(PageRequest.of(pageNo, size));

    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable String id) {
        carRepository.deleteById(id);

    }

    @PutMapping
    public void update(@RequestBody CarModel carModel) {
        carRepository.save(carModel);

    }
}
