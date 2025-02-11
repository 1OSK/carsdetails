package org.example.mapper;

import javax.annotation.processing.Generated;
import org.example.dto.ManufacturerDTO;
import org.example.model.Manufacturer;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-02-11T00:24:46+0300",
    comments = "version: 1.5.2.Final, compiler: javac, environment: Java 17.0.14 (JetBrains s.r.o.)"
)
@Component
public class ManufacturerMapperImpl implements ManufacturerMapper {

    @Override
    public ManufacturerDTO manufacturerToManufacturerDTO(Manufacturer manufacturer) {
        if ( manufacturer == null ) {
            return null;
        }

        ManufacturerDTO manufacturerDTO = new ManufacturerDTO();

        manufacturerDTO.setId( manufacturer.getId() );
        manufacturerDTO.setName( manufacturer.getName() );
        manufacturerDTO.setCountry( manufacturer.getCountry() );

        return manufacturerDTO;
    }

    @Override
    public Manufacturer manufacturerDTOToManufacturer(ManufacturerDTO manufacturerDTO) {
        if ( manufacturerDTO == null ) {
            return null;
        }

        Manufacturer manufacturer = new Manufacturer();

        manufacturer.setId( manufacturerDTO.getId() );
        manufacturer.setName( manufacturerDTO.getName() );
        manufacturer.setCountry( manufacturerDTO.getCountry() );

        return manufacturer;
    }
}
