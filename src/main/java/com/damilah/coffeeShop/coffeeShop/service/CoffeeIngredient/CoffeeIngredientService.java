package com.damilah.coffeeShop.coffeeShop.service.CoffeeIngredient;

import com.damilah.coffeeShop.coffeeShop.entity.Coffee;
import com.damilah.coffeeShop.coffeeShop.entity.Ingredient;

public interface CoffeeIngredientService {
    Ingredient findIngredientByCoffeeId(int theId);
    Coffee findCoffeeByIngredientId(int theId);
}
