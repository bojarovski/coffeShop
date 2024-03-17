package com.damilah.coffeeShop.coffeeShop.rest;

import com.damilah.coffeeShop.coffeeShop.entity.Coffee;
import com.damilah.coffeeShop.coffeeShop.entity.CoffeeIngredient;
import com.damilah.coffeeShop.coffeeShop.entity.Ingredient;
import com.damilah.coffeeShop.coffeeShop.request.CoffeeIngredientRequest;
import com.damilah.coffeeShop.coffeeShop.service.CoffeeIngredient.CoffeeIngredientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.Array;
import java.util.List;
import java.util.Map;

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
    public void addIngredientsToCoffee(@RequestBody Map<String, Object> request) {
        int coffeeId = (int) request.get("coffee_id");
        List<Integer> ingredientIds = (List<Integer>) request.get("ingredients_ids");

        System.out.println("Coffee ID: " + coffeeIngredientService.findIngredientByCoffeeId(coffeeId));
        System.out.println("Ingredient IDs: " + ingredientIds);
    }

    @DeleteMapping("/coffeeIngredient/{coffeeId}")
    public ResponseEntity<Void> deleteByCoffeeId(@PathVariable Integer coffeeId) {
        coffeeIngredientService.deleteByCoffeeId(coffeeId);
        return ResponseEntity.noContent().build();
    }

    @PostMapping("/add/ingredient")
    public ResponseEntity<Void> addCoffeeIngredient(@RequestBody CoffeeIngredientRequest request) {
        Integer coffeeId = request.getCoffee_id();
        List<Integer> ingredientIds = request.getIngredient_ids();
        Integer quantity = request.getQuantity();

        // Populate CoffeeIngredient entities based on the request data
        for (Integer ingredientId : ingredientIds) {
            CoffeeIngredient coffeeIngredient = new CoffeeIngredient();
            coffeeIngredient.setCoffeeId(coffeeId);
            coffeeIngredient.setIngredientId(ingredientId);
            coffeeIngredient.setQuantity(quantity);
            coffeeIngredientService.save(coffeeIngredient);
        }

        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

}
