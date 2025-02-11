package org.example.mapper;

import javax.annotation.processing.Generated;
import org.example.dto.CarDTO;
import org.example.model.Car;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-02-11T00:24:46+0300",
    comments = "version: 1.5.2.Final, compiler: javac, environment: Java 17.0.14 (JetBrains s.r.o.)"
)
@Component
public class CarMapperImpl implements CarMapper {

    @Override
    public CarDTO carToCarDTO(Car car) {
        if ( car == null ) {
            return null;
        }

        CarDTO carDTO = new CarDTO();

        carDTO.setId( car.getId() );
        carDTO.setMake( car.getMake() );
        carDTO.setModel( car.getModel() );
        carDTO.setYear( car.getYear() );
        carDTO.setVin( car.getVin() );

        return carDTO;
    }

    @Override
    public Car carDTOToCar(CarDTO carDTO) {
        if ( carDTO == null ) {
            return null;
        }

        Car car = new Car();

        car.setId( carDTO.getId() );
        car.setMake( carDTO.getMake() );
        car.setModel( carDTO.getModel() );
        car.setYear( carDTO.getYear() );
        car.setVin( carDTO.getVin() );

        return car;
    }
}
