package com.damilah.coffeeShop.coffeeShop.dao.Ingredient;

import com.damilah.coffeeShop.coffeeShop.entity.Ingredient;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class IngredientDAOJpaImpl implements  IngredientDAO{

    private EntityManager entityManager;

    //    set up constructor injection
    @Autowired
    public IngredientDAOJpaImpl(EntityManager theEntityManager){
        entityManager = theEntityManager;
    }
    @Override
    public List<Ingredient> findAll() {
        //        Create query
        TypedQuery<Ingredient> theQuery = entityManager.createQuery("from Ingredient", Ingredient.class);
        //        Execute query and get resul list
        List<Ingredient> ingredients = theQuery.getResultList();
        return ingredients;
    }
}
