package com.damilah.coffeeShop.coffeeShop.service.Coffee;

import com.damilah.coffeeShop.coffeeShop.dao.CoffeeRepository;
import com.damilah.coffeeShop.coffeeShop.entity.Coffee;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CoffeeServiceImpl implements CoffeeService{

    private CoffeeRepository coffeeRepository;

    public  CoffeeServiceImpl(CoffeeRepository theCoffeeRepository){
        coffeeRepository = theCoffeeRepository;
    }
    @Override
    public List<Coffee> findAll() {
        return coffeeRepository.findAll();
    }

    @Override
    public List<Coffee> findCoffeesWithIngredientName(int ingredientName) {
        return coffeeRepository.findCoffeesWithIngredientName(ingredientName);
    }
}
