package org.example.mapper;

import org.example.dto.CarModelDTO;
import org.example.model.CarModel;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CarModelMapper {

    CarModelDTO carModelToCarModelDTO(CarModel carModel);

    CarModel carModelDTOToCarModel(CarModelDTO carModelDTO);
}