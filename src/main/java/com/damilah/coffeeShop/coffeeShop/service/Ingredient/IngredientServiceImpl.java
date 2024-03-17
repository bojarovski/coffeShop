package com.damilah.coffeeShop.coffeeShop.service.Ingredient;

import com.damilah.coffeeShop.coffeeShop.dao.IngredientRepository;
import com.damilah.coffeeShop.coffeeShop.entity.Ingredient;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IngredientServiceImpl implements IngredientService{

    private IngredientRepository ingredientRepository;

    public  IngredientServiceImpl(IngredientRepository theIngredientRepository){
        ingredientRepository = theIngredientRepository;
    }
    @Override
    public List<Ingredient> findAll() {
        return ingredientRepository.findAll();
    }

    @Override
    public Ingredient findById(int theId) {
        return ingredientRepository.findById(theId)
                .orElseThrow(() -> new RuntimeException("Did not find coffee id - " + theId));
    }

    @Override
    public Ingredient save(Ingredient theIngredient) {
        return ingredientRepository.save(theIngredient);
    }

    @Override
    public void deleteById(int theId) {
        ingredientRepository.deleteById(theId);
    }

    @Override
    public List<Ingredient> findIngredientsByCoffeeId(int coffeeId) {
        return ingredientRepository.findIngredientsByCoffeeId(coffeeId);
    }


}
