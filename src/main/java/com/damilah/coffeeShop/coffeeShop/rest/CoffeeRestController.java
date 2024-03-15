package com.damilah.coffeeShop.coffeeShop.rest;

import com.damilah.coffeeShop.coffeeShop.entity.Coffee;
import com.damilah.coffeeShop.coffeeShop.service.Coffee.CoffeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class CoffeeRestController {
    private CoffeeService coffeeService;

    @Autowired
    public CoffeeRestController(CoffeeService theCoffeeService){
        coffeeService = theCoffeeService;
    }


    @GetMapping("/coffees")
    public List<Coffee> findAll(){
        return coffeeService.findAll();
    }

    @GetMapping("/coffees/{ingredientName}")
    public List<Coffee> getCoffeesWithIngredient(@PathVariable int ingredientName) {
        List<Coffee> coffees = coffeeService.findCoffeesWithIngredientName(ingredientName);
        if (coffees.isEmpty()) {
            throw new RuntimeException("Error");
        }
        return coffees;
    }

}
