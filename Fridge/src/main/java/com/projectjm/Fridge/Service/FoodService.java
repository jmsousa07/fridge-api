package com.projectjm.Fridge.Service;
import com.projectjm.Fridge.Model.Food;
import com.projectjm.Fridge.Repository.FoodRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FoodService {

    public final FoodRepository foodRepository;

    public FoodService(FoodRepository foodRepository) {
        this.foodRepository = foodRepository;
    }

    // LISTAR
    public List<Food> getAll() { return foodRepository.findAll(); }

    // CRIAR
    public  Food save(Food food) { return foodRepository.save(food); }

    //DELETAR
    public void delete(Long id) { foodRepository.deleteById(id); }
}