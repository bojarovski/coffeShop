package com.damilah.coffeeShop.coffeeShop.dao.CoffeeIngredient;

import com.damilah.coffeeShop.coffeeShop.entity.Coffee;
import com.damilah.coffeeShop.coffeeShop.entity.CoffeeIngredient;
import com.damilah.coffeeShop.coffeeShop.entity.Ingredient;

public interface CoffeeIngredientDAO {

    Ingredient findCoffeeByIngredientId (int theId);
    Coffee findIngredientByCoffeeId(int theId);
    void deleteByCoffeeId(Integer coffeeId);

    void save(CoffeeIngredient coffeeIngredient);

}
