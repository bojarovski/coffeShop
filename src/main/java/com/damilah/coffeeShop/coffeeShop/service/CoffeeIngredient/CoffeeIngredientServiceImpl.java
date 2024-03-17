package com.damilah.coffeeShop.coffeeShop.service.CoffeeIngredient;

import com.damilah.coffeeShop.coffeeShop.dao.CoffeeIngredient.CoffeeIngredientDAOJpaImpl;
import com.damilah.coffeeShop.coffeeShop.entity.Coffee;
import com.damilah.coffeeShop.coffeeShop.entity.Ingredient;
import org.springframework.stereotype.Service;

@Service
public class CoffeeIngredientServiceImpl implements CoffeeIngredientService{

    private CoffeeIngredientDAOJpaImpl coffeeIngredientDAOJpa;

    public CoffeeIngredientServiceImpl (CoffeeIngredientDAOJpaImpl theCoffeeIngredientDAOJpaImpl){
        coffeeIngredientDAOJpa = theCoffeeIngredientDAOJpaImpl;
    }
    @Override
    public Coffee findIngredientByCoffeeId(int theId) {
        return coffeeIngredientDAOJpa.findIngredientByCoffeeId(theId);
    }

    @Override
    public Ingredient findCoffeeByIngredientId(int theId) {
        return coffeeIngredientDAOJpa.findCoffeeByIngredientId(theId);
    }

    @Override
    public void update(Coffee tempCoffee) {
        coffeeIngredientDAOJpa.update(tempCoffee);
    }
}
