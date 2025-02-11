package org.example.mapper;

import javax.annotation.processing.Generated;
import org.example.dto.CarModelDTO;
import org.example.model.CarModel;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-02-11T00:24:46+0300",
    comments = "version: 1.5.2.Final, compiler: javac, environment: Java 17.0.14 (JetBrains s.r.o.)"
)
@Component
public class CarModelMapperImpl implements CarModelMapper {

    @Override
    public CarModelDTO carModelToCarModelDTO(CarModel carModel) {
        if ( carModel == null ) {
            return null;
        }

        CarModelDTO carModelDTO = new CarModelDTO();

        carModelDTO.setId( carModel.getId() );
        carModelDTO.setName( carModel.getName() );
        carModelDTO.setGeneration( carModel.getGeneration() );
        carModelDTO.setDescription( carModel.getDescription() );

        return carModelDTO;
    }

    @Override
    public CarModel carModelDTOToCarModel(CarModelDTO carModelDTO) {
        if ( carModelDTO == null ) {
            return null;
        }

        CarModel carModel = new CarModel();

        carModel.setId( carModelDTO.getId() );
        carModel.setName( carModelDTO.getName() );
        carModel.setGeneration( carModelDTO.getGeneration() );
        carModel.setDescription( carModelDTO.getDescription() );

        return carModel;
    }
}
