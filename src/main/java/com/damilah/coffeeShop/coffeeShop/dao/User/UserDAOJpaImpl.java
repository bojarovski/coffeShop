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

    @Override
    public User findById(int theId) {
        return entityManager.find(User.class, theId);
    }

    @Override
    public User save(User theUser) {
        return entityManager.merge(theUser);
    }

    @Override
    public void deleteById(int theId) {
        User theUser = entityManager.find(User.class, theId);
        entityManager.remove(theUser);
    }
}
