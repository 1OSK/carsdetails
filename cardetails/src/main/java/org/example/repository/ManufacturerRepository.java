package org.example.repository;

import org.example.model.Manufacturer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository  // Явно помечаем как репозиторий
public interface ManufacturerRepository extends JpaRepository<Manufacturer, Long> {
    // Поиск производителя по имени
    Manufacturer findByName(String name);

    // Поиск по стране производителя
    Manufacturer findByCountry(String country);
}