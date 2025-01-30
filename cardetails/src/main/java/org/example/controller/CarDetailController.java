package org.example.controller;


import org.example.dto.CarDetailDTO;
import org.example.mapper.CarDetailMapper;
import org.example.service.CarDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cars/{carId}/details")
public class CarDetailController {

    @Autowired
    private CarDetailService carDetailService;

    @Autowired
    private CarDetailMapper carDetailMapper;

    @PostMapping
    public ResponseEntity<CarDetailDTO> addDetailToCar(
            @PathVariable Long carId,

            @RequestBody CarDetailDTO carDetailDTO) {

        var carDetail = carDetailMapper.carDetailDTOToCarDetail(carDetailDTO);  // Преобразуем DTO в сущность
        var savedCarDetail = carDetailService.addDetailToCar(carId, carDetail);  // Добавляем деталь
        var savedCarDetailDTO = carDetailMapper.carDetailToCarDetailDTO(savedCarDetail);  // Преобразуем обратно в DTO
        return ResponseEntity.ok(savedCarDetailDTO);
    }
}