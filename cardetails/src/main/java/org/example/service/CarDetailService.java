package org.example.service;

import org.example.model.Car;
import org.example.model.CarDetail;
import org.example.repository.CarDetailRepository;
import org.example.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarDetailService {

    @Autowired
    private CarDetailRepository carDetailRepository;

    @Autowired
    private CarRepository carRepository;

    public CarDetail addDetailToCar(Long carId, CarDetail carDetail) {
        Car car = carRepository.findById(carId)
                .orElseThrow(() -> new RuntimeException("Car not found"));
        carDetail.setCar(car);  // Связываем деталь с автомобилем
        return carDetailRepository.save(carDetail);
    }
}