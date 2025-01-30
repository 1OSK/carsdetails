package org.example.repository;

import org.example.model.CarModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository  // Явно помечаем как репозиторий
public interface CarModelRepository extends JpaRepository<CarModel, Long> {
    // Поиск модели по имени
    List<CarModel> findByName(String name);

    // Поиск по поколению
    List<CarModel> findByGeneration(String generation);
}