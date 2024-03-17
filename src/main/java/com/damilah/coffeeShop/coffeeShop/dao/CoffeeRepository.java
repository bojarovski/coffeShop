package com.damilah.coffeeShop.coffeeShop.dao;

import com.damilah.coffeeShop.coffeeShop.entity.Coffee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CoffeeRepository extends JpaRepository<Coffee, Integer> {
    @Query(value = "SELECT c.*  FROM coffee_ingredient ci " +
            "INNER JOIN coffee c ON ci.coffee_id = c.id " +
            "WHERE ci.ingredient_id = :ingredientId", nativeQuery = true)
    List<Coffee> findCoffeesWithIngredientName(int ingredientId);
}
