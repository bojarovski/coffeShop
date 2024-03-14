package com.damilah.coffeeShop.coffeeShop.dao.Coffee;

import com.damilah.coffeeShop.coffeeShop.entity.Coffee;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CoffeeDAOJpaImpl implements CoffeeDAO{

    //    define field for entity manager
    private EntityManager entityManager;

    //    set up constructor injection
    @Autowired
    public CoffeeDAOJpaImpl(EntityManager theEntityManager){
        entityManager = theEntityManager;
    }

    @Override
    public List<Coffee> findAll() {
        //        Create query
        TypedQuery<Coffee> theQuery = entityManager.createQuery("from Coffee", Coffee.class);
        //        Execute query and get resul list
        List<Coffee> coffes = theQuery.getResultList();
        return coffes;
    }
}
