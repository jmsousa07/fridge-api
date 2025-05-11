package com.projectjm.Fridge.Crontroller;

import com.projectjm.Fridge.Model.Food;
import com.projectjm.Fridge.Service.FoodService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/food")
public class FoodController {

    // Dependency Injection
    private final FoodService foodService;

    public FoodController(FoodService foodService) {
        this.foodService = foodService;
    }

    @GetMapping
    public List<Food> getAll() { return foodService.getAll(); }

    @PostMapping
    public Food create(@RequestBody Food food) { return foodService.save(food); }
}