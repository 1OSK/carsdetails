package org.example.repository;

import org.example.model.CarDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository  // Аннотация @Repository не обязательна, но можно добавить для явного указания
public interface CarDetailRepository extends JpaRepository<CarDetail, Long> {
    CarDetail findByName(String name);
}