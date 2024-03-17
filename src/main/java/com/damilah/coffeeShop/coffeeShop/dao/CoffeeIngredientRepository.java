package com.damilah.coffeeShop.coffeeShop.dao;

import com.damilah.coffeeShop.coffeeShop.entity.CoffeeIngredient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

public interface CoffeeIngredientRepository extends JpaRepository<CoffeeIngredient, Integer> {

    @Transactional
    @Modifying
    @Query("DELETE FROM CoffeeIngredient ci WHERE ci.coffeeId = :coffeeId")
    void deleteByCoffeeId(Integer coffeeId);

    // You can also add custom query methods to create new CoffeeIngredient entities
    // For example:
    // CoffeeIngredient save(CoffeeIngredient coffeeIngredient);
}
