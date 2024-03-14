package com.damilah.coffeeShop.coffeeShop.dao.Coffee;

import com.damilah.coffeeShop.coffeeShop.entity.Coffee;

import java.util.List;

public interface CoffeeDAO {
    List<Coffee> findAll();
}
