package com.damilah.coffeeShop.coffeeShop.service.Ingredient;

import com.damilah.coffeeShop.coffeeShop.dao.Ingredient.IngredientDAO;
import com.damilah.coffeeShop.coffeeShop.entity.Ingredient;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IngredientServiceImpl implements IngredientService{

    private IngredientDAO ingredientDAO;

    public  IngredientServiceImpl(IngredientDAO theIngredientDAO){
        ingredientDAO = theIngredientDAO;
    }
    @Override
    public List<Ingredient> findAll() {
        return ingredientDAO.findAll();
    }
}
