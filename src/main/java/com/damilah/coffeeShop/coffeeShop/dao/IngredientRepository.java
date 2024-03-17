package com.damilah.coffeeShop.coffeeShop.dao;

import com.damilah.coffeeShop.coffeeShop.entity.Coffee;
import com.damilah.coffeeShop.coffeeShop.entity.Ingredient;
import com.damilah.coffeeShop.coffeeShop.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface IngredientRepository extends JpaRepository<Ingredient, Integer> {
    @Query(value = "SELECT i.id, i.name, i.description FROM coffee_ingredient ci " +
            "LEFT JOIN ingredient i ON ci.ingredient_id = i.id " +
            "WHERE ci.coffee_id = :coffeeId", nativeQuery = true)
    List<Ingredient> findIngredientsByCoffeeId(int coffeeId);
}
