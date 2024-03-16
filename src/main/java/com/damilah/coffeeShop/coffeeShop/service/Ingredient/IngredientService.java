package com.damilah.coffeeShop.coffeeShop.service.Ingredient;

import com.damilah.coffeeShop.coffeeShop.entity.Coffee;
import com.damilah.coffeeShop.coffeeShop.entity.Ingredient;

import java.util.List;

public interface IngredientService {
    List<Ingredient> findAll();
    Ingredient findById(int theId);
    Ingredient save(Ingredient theIngredient);
    void deleteById(int theId);
    List<Ingredient> findCoffeesWithIngredientName(int coffeeId);
}
