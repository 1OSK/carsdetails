package org.example.repository;

import org.example.model.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository  // Явно помечаем как репозиторий
public interface CarRepository extends JpaRepository<Car, Long> {
    // Поиск по марке автомобиля
    List<Car> findByMake(String make);

    // Поиск по модели автомобиля
    List<Car> findByModel(String model);
}