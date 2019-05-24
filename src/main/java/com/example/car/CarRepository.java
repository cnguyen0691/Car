package com.example.car;

import org.springframework.data.repository.CrudRepository;

public interface CarRepository extends CrudRepository<Car, Long> {
    Iterable<Car> findAllByCategory(Category category);
}
