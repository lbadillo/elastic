package com.elasticsample.app.repository;

import com.elasticsample.app.model.CarModel;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;



public interface CarRepository extends ElasticsearchRepository<CarModel,String> {
    Page<CarModel> findAll(Pageable pageable);
}
