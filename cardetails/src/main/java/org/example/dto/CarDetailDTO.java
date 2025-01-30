package org.example.dto;

import lombok.Data;

@Data
public class CarDetailDTO {
    private Long id;
    private String name; // Название детали (например, "Двигатель")
    private String description; // Описание детали
    private Double price; // Цена детали
}