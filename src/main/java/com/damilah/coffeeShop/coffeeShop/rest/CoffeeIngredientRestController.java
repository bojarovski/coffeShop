package com.damilah.coffeeShop.coffeeShop.rest;

import com.damilah.coffeeShop.coffeeShop.entity.Coffee;
import com.damilah.coffeeShop.coffeeShop.service.CoffeeIngredient.CoffeeIngredientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class CoffeeIngredientRestController {
    private CoffeeIngredientService coffeeIngredientService;

    @Autowired
    public CoffeeIngredientRestController(CoffeeIngredientService theCoffeeIngredientService){
        coffeeIngredientService = theCoffeeIngredientService;
    }
    @GetMapping("/coffees_by_ingredient_id/{ingredient_id}")
    public Coffee getCoffeesByIngredientId(@PathVariable("ingredient_id") int ingredientId) {
        return coffeeIngredientService.findCoffeeByIngredientId(ingredientId);
    }

}
