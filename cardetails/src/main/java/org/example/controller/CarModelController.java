package org.example.controller;


import org.example.dto.CarModelDTO;
import org.example.mapper.CarModelMapper;
import org.example.service.CarModelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/carModels")
public class CarModelController {

    @Autowired
    private CarModelService carModelService;

    @Autowired
    private CarModelMapper carModelMapper;

    @PostMapping
    public ResponseEntity<CarModelDTO> createCarModel(
            @RequestBody CarModelDTO carModelDTO) {

        var carModel = carModelMapper.carModelDTOToCarModel(carModelDTO);  // Преобразуем DTO в сущность
        var savedCarModel = carModelService.createCarModel(carModel);  // Создаем модель автомобиля
        var savedCarModelDTO = carModelMapper.carModelToCarModelDTO(savedCarModel);  // Преобразуем обратно в DTO
        return ResponseEntity.ok(savedCarModelDTO);
    }
}