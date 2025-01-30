package org.example.controller;


import org.example.dto.ManufacturerDTO;
import org.example.mapper.ManufacturerMapper;
import org.example.service.ManufacturerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/manufacturers")
public class ManufacturerController {

    @Autowired
    private ManufacturerService manufacturerService;

    @Autowired
    private ManufacturerMapper manufacturerMapper;

    @PostMapping
    public ResponseEntity<ManufacturerDTO> createManufacturer(
            @RequestBody ManufacturerDTO manufacturerDTO) {

        var manufacturer = manufacturerMapper.manufacturerDTOToManufacturer(manufacturerDTO);  // Преобразуем DTO в сущность
        var savedManufacturer = manufacturerService.createManufacturer(manufacturer);  // Создаем производителя
        var savedManufacturerDTO = manufacturerMapper.manufacturerToManufacturerDTO(savedManufacturer);  // Преобразуем обратно в DTO
        return ResponseEntity.ok(savedManufacturerDTO);
    }
}