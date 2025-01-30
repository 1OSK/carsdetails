package org.example.dto;

import lombok.Data;

@Data
public class CarDTO {
    private Long id;
    private String make; // Марка автомобиля
    private String model; // Модель автомобиля
    private int year; // Год выпуска
    private String vin; // VIN номер
}