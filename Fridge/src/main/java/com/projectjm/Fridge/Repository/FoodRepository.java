package com.projectjm.Fridge.Repository;
import com.projectjm.Fridge.Model.Food;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FoodRepository extends JpaRepository<Food, Long> {
}