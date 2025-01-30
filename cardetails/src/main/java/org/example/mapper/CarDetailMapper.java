package org.example.mapper;

import org.example.dto.CarDetailDTO;
import org.example.model.CarDetail;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CarDetailMapper {

    CarDetailDTO carDetailToCarDetailDTO(CarDetail carDetail);

    CarDetail carDetailDTOToCarDetail(CarDetailDTO carDetailDTO);
}