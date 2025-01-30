package org.example.dto;

import lombok.Data;

@Data
public class ManufacturerDTO {
    private Long id;
    private String name; // Название производителя
    private String country; // Страна производителя
}