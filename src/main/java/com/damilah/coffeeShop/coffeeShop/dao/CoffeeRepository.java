package com.damilah.coffeeShop.coffeeShop.dao;

import com.damilah.coffeeShop.coffeeShop.entity.Coffee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CoffeeRepository extends JpaRepository<Coffee, Integer> {
    @Query(value = "SELECT c.*  FROM coffee c " +
            "INNER JOIN coffee_ingredient ci ON c.id = ci.coffee_id " +
            "INNER JOIN ingredient i ON ci.ingredient_id = i.id " +
            "WHERE i.id = :ingredientName", nativeQuery = true)
    List<Coffee> findCoffeesWithIngredientName(int ingredientName);
}
