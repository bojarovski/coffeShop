package com.damilah.coffeeShop.coffeeShop.controllers;

import com.damilah.coffeeShop.coffeeShop.entity.Coffee;
import com.damilah.coffeeShop.coffeeShop.rest.CoffeeRestController;
import com.damilah.coffeeShop.coffeeShop.service.Coffee.CoffeeService;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

@SpringBootTest
public class CoffeeRestControllerTest {
    @Mock
    private CoffeeService coffeeService;

    @InjectMocks
    private CoffeeRestController coffeeRestController;

    @Test
    public void testFindAllCoffees() {
        // Arrange
        List<Coffee> coffeeList = new ArrayList<>();
        coffeeList.add(new Coffee("1", "Coffee 1", "Description 1"));
        coffeeList.add(new Coffee("2", "Coffee 2", "Description 2"));

        when(coffeeService.findAll()).thenReturn(coffeeList);

        // Act
        List<Coffee> result = coffeeRestController.findAll();

        // Assert
        assertEquals(2, result.size());
    }

    @Test
    public void testGetCoffeesWithIngredient() {
        // Arrange
        int ingredientId = 1;
        List<Coffee> coffeeList = new ArrayList<>();
        coffeeList.add(new Coffee("1", "Coffee 1", "Description 1"));

        when(coffeeService.findCoffeesWithIngredientName(ingredientId)).thenReturn(coffeeList);

        // Act
        List<Coffee> result = coffeeRestController.getCoffeesWithIngredient(ingredientId);

        // Assert
        assertEquals(1, result.size());
    }

    @Test
    public void testDeleteCoffee() {
        // Arrange
        int coffeeId = 1;
        Coffee coffee = new Coffee("1", "Coffee 1", "Description 1");

        when(coffeeService.findById(coffeeId)).thenReturn(coffee);

        // Act
        String result = coffeeRestController.deleteUser(coffeeId);

        // Assert
        assertEquals("Coffee is deleted successfully", result);
        verify(coffeeService, times(1)).deleteById(coffeeId);
    }
}
