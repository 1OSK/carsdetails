package org.example.controller;


import org.example.dto.CarDTO;
import org.example.mapper.CarMapper;
import org.example.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cars")
public class CarController {

    @Autowired
    private CarService carService;

    @Autowired
    private CarMapper carMapper;

    @PostMapping
    public ResponseEntity<CarDTO> createCar(@RequestBody CarDTO carDTO) {
        var car = carMapper.carDTOToCar(carDTO);  // Преобразуем DTO в сущность
        var savedCar = carService.createCar(car);  // Создаем автомобиль
        var savedCarDTO = carMapper.carToCarDTO(savedCar);  // Преобразуем обратно в DTO
        return ResponseEntity.ok(savedCarDTO);
    }
}