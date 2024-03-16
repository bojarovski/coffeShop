package com.damilah.coffeeShop.coffeeShop.rest;

import com.damilah.coffeeShop.coffeeShop.entity.Coffee;
import com.damilah.coffeeShop.coffeeShop.entity.Ingredient;
import com.damilah.coffeeShop.coffeeShop.service.Ingredient.IngredientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class IngredientRestController {

    private IngredientService ingredientService;

    @Autowired
    public IngredientRestController(IngredientService theIngredientService){
        ingredientService = theIngredientService;
    }

    @GetMapping("/ingredients")
    public List<Ingredient> findAll(){
        return ingredientService.findAll();
    }

    @PostMapping("/ingredients")
    public Ingredient addCoffee(@RequestBody Ingredient theIngredient){

        theIngredient.setId(0);
        return ingredientService.save(theIngredient);
    }
}
