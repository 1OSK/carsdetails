package org.example.service;

import org.example.model.CarModel;
import org.example.repository.CarModelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarModelService {

    @Autowired
    private CarModelRepository carModelRepository;

    public CarModel createCarModel(CarModel carModel) {
        return carModelRepository.save(carModel);
    }
}