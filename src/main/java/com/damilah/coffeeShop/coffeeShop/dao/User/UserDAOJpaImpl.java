package com.damilah.coffeeShop.coffeeShop.dao.User;

import com.damilah.coffeeShop.coffeeShop.entity.User;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserDAOJpaImpl implements UserDAO{

//    define field for entity manager
    private EntityManager entityManager;


//    set up constructor injection
    @Autowired
    public  UserDAOJpaImpl(EntityManager theEntityManager){
        entityManager = theEntityManager;
    }

    @Override
    public List<User> findAll() {
//        Create query
        TypedQuery<User> theQuery = entityManager.createQuery("from User", User.class);
//        Execute query and get resul list
        List<User> users = theQuery.getResultList();
        return users;
    }
}
