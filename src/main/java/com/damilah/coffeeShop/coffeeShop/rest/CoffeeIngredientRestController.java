package com.damilah.coffeeShop.coffeeShop.rest;

import com.damilah.coffeeShop.coffeeShop.entity.Coffee;
import com.damilah.coffeeShop.coffeeShop.entity.Ingredient;
import com.damilah.coffeeShop.coffeeShop.service.CoffeeIngredient.CoffeeIngredientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class CoffeeIngredientRestController {
    private CoffeeIngredientService coffeeIngredientService;

    @Autowired
    public CoffeeIngredientRestController(CoffeeIngredientService theCoffeeIngredientService){
        coffeeIngredientService = theCoffeeIngredientService;
    }
    @GetMapping("/coffees_by_ingredient_id/{ingredient_id}")
    public Ingredient getCoffeesByIngredientId(@PathVariable("ingredient_id") int ingredientId) {
        return coffeeIngredientService.findCoffeeByIngredientId(ingredientId);
    }

    @GetMapping("/ingredients_by_coffee_id/{coffee_id}")
    public Coffee getIngredientsByCoffeeId(@PathVariable("coffee_id") int coffeeId) {
        return coffeeIngredientService.findIngredientByCoffeeId(coffeeId);
    }

    @PostMapping("/addIngredientsToCoffee")
    public void addIngradientsToCoffee(@RequestBody Coffee theCoffee) {
//        theCoffee.seId(0);
        coffeeIngredientService.update(theCoffee);
    }

}
