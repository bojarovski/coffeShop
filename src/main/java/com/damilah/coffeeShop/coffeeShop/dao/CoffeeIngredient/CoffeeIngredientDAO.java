package com.damilah.coffeeShop.coffeeShop.dao.CoffeeIngredient;

import com.damilah.coffeeShop.coffeeShop.entity.Coffee;
import com.damilah.coffeeShop.coffeeShop.entity.Ingredient;

public interface CoffeeIngredientDAO {

    Ingredient findCoffeeByIngredientId (int theId);
    Coffee findIngredientByCoffeeId(int theId);

    void update (Coffee tempCoffee);

}
