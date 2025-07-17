package com.elasticsample.app.repository;

import com.elasticsample.app.model.CarModel;
import lombok.NonNull;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;


public interface CarRepository extends ElasticsearchRepository<CarModel,String> {
    Page<CarModel> findAll(@NonNull Pageable pageable);
}
