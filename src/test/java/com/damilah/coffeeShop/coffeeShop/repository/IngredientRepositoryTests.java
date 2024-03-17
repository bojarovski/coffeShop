package com.damilah.coffeeShop.coffeeShop.repository;

import com.damilah.coffeeShop.coffeeShop.dao.IngredientRepository;
import com.damilah.coffeeShop.coffeeShop.entity.Ingredient;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
public class IngredientRepositoryTests {

    @Autowired
    private TestEntityManager entityManager;

    @Autowired
    private IngredientRepository ingredientRepository;

    @Test
    public void testFindIngredientsByCoffeeId() {
        // Given
        // Create and persist sample data
        Ingredient ingredient1 = new Ingredient("Coffee Beans", "Arabica coffee beans");
        Ingredient ingredient2 = new Ingredient("Milk", "Fresh milk");
        entityManager.persist(ingredient1);
        entityManager.persist(ingredient2);

        // Create a coffee and associate ingredients with it
        // Suppose coffee with ID 1 is associated with ingredient1 and ingredient2
        // Persist coffee_ingredient entries accordingly in the database

        // When
        List<Ingredient> ingredients = ingredientRepository.findIngredientsByCoffeeId(1);

        // Then
        assertThat(ingredients).isNotNull();
        assertThat(ingredients.size()).isEqualTo(2);
        // Add more assertions based on the expected data retrieved
        // For example, you can assert on the properties of each ingredient object
    }
}
