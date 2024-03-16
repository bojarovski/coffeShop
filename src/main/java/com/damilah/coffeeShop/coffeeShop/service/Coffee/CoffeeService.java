package com.damilah.coffeeShop.coffeeShop.service.Coffee;

import com.damilah.coffeeShop.coffeeShop.entity.Coffee;

import java.util.List;

public interface CoffeeService {
    List<Coffee> findAll();
    Coffee findById(int theId);
    Coffee save(Coffee theCoffee);
    void deleteById(int theId);
    List<Coffee> findCoffeesWithIngredientName(int ingredientName);
}

