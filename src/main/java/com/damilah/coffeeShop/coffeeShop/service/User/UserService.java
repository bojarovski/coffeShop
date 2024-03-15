package com.damilah.coffeeShop.coffeeShop.service.User;

import com.damilah.coffeeShop.coffeeShop.entity.User;

import java.util.List;

public interface UserService {

    List<User> findAll();
    User findById(int theId);

    User save(User theUser);

    void deleteById(int theId);
}