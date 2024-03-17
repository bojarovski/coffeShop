package com.damilah.coffeeShop.coffeeShop.dao.CoffeeIngredient;

import com.damilah.coffeeShop.coffeeShop.entity.Coffee;
import com.damilah.coffeeShop.coffeeShop.entity.Ingredient;

public interface CoffeeIngredientDAO {

    Ingredient findIngredientByCoffeeId(int theId);
    Coffee findCoffeeByIngredientId(int theId);
}
