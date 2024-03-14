package com.damilah.coffeeShop.coffeeShop.service.Coffee;

import com.damilah.coffeeShop.coffeeShop.dao.Coffee.CoffeeDAO;
import com.damilah.coffeeShop.coffeeShop.dao.Ingredient.IngredientDAO;
import com.damilah.coffeeShop.coffeeShop.entity.Coffee;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CoffeeServiceImpl implements CoffeeService{

    private CoffeeDAO coffeeDAO;

    public  CoffeeServiceImpl(CoffeeDAO theCoffeeDAO){
        coffeeDAO = theCoffeeDAO;
    }
    @Override
    public List<Coffee> findAll() {
        return coffeeDAO.findAll();
    }
}
