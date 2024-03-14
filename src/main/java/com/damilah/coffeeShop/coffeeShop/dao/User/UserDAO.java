package com.damilah.coffeeShop.coffeeShop.dao.User;

import com.damilah.coffeeShop.coffeeShop.entity.User;

import java.util.List;

public interface UserDAO {

    List<User> findAll();

    User findById(int theId);

    User save(User theUser);

    void deleteById(int theId);
}
