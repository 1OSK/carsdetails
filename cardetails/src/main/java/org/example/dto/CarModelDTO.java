package org.example.dto;

import lombok.Data;

@Data
public class CarModelDTO {
    private Long id;
    private String name; // Название модели автомобиля
    private String generation; // Поколение модели
    private String description; // Описание модели
}