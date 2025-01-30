package org.example.mapper;

import org.example.dto.ManufacturerDTO;
import org.example.model.Manufacturer;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ManufacturerMapper {

    ManufacturerDTO manufacturerToManufacturerDTO(Manufacturer manufacturer);

    Manufacturer manufacturerDTOToManufacturer(ManufacturerDTO manufacturerDTO);
}