package com.damilah.coffeeShop.coffeeShop.service.CoffeeIngredient;

import com.damilah.coffeeShop.coffeeShop.entity.Coffee;
import com.damilah.coffeeShop.coffeeShop.entity.Ingredient;

public interface CoffeeIngredientService {
    Coffee findIngredientByCoffeeId(int theId);
    Ingredient findCoffeeByIngredientId(int theId);
}
