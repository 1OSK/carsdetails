package org.example.mapper;

import javax.annotation.processing.Generated;
import org.example.dto.CarDetailDTO;
import org.example.model.CarDetail;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-02-11T00:24:46+0300",
    comments = "version: 1.5.2.Final, compiler: javac, environment: Java 17.0.14 (JetBrains s.r.o.)"
)
@Component
public class CarDetailMapperImpl implements CarDetailMapper {

    @Override
    public CarDetailDTO carDetailToCarDetailDTO(CarDetail carDetail) {
        if ( carDetail == null ) {
            return null;
        }

        CarDetailDTO carDetailDTO = new CarDetailDTO();

        carDetailDTO.setId( carDetail.getId() );
        carDetailDTO.setName( carDetail.getName() );
        carDetailDTO.setDescription( carDetail.getDescription() );
        carDetailDTO.setPrice( carDetail.getPrice() );

        return carDetailDTO;
    }

    @Override
    public CarDetail carDetailDTOToCarDetail(CarDetailDTO carDetailDTO) {
        if ( carDetailDTO == null ) {
            return null;
        }

        CarDetail carDetail = new CarDetail();

        carDetail.setId( carDetailDTO.getId() );
        carDetail.setName( carDetailDTO.getName() );
        carDetail.setDescription( carDetailDTO.getDescription() );
        carDetail.setPrice( carDetailDTO.getPrice() );

        return carDetail;
    }
}
