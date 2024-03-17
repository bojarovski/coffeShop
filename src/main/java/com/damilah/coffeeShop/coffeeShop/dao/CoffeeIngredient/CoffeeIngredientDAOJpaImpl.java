package com.damilah.coffeeShop.coffeeShop.dao.CoffeeIngredient;

import com.damilah.coffeeShop.coffeeShop.entity.Coffee;
import com.damilah.coffeeShop.coffeeShop.entity.Ingredient;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class CoffeeIngredientDAOJpaImpl implements CoffeeIngredientDAO {

    private EntityManager entityManager;

    //    set up constructor injection
    @Autowired
    public CoffeeIngredientDAOJpaImpl(EntityManager theEntityManager){
        entityManager = theEntityManager;
    }


    @Override
    public Ingredient findCoffeeByIngredientId(int theId) {
        TypedQuery<Ingredient> query = entityManager.createQuery(
                "select i from Ingredient i JOIN FETCH i.coffees where i.id = :data", Ingredient.class
        );
        query.setParameter("data", theId);

        return query.getSingleResult();
    }

    @Override
    public Coffee findIngredientByCoffeeId(int theId) {
        TypedQuery<Coffee> query = entityManager.createQuery(
                "select c from Coffee c JOIN FETCH c.ingredients where c.id = :data", Coffee.class
        );
        query.setParameter("data", theId);

        return query.getSingleResult();
    }
}
