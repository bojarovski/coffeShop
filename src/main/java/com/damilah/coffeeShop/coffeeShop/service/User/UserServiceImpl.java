package com.damilah.coffeeShop.coffeeShop.service.User;

import com.damilah.coffeeShop.coffeeShop.dao.User.UserDAO;
import com.damilah.coffeeShop.coffeeShop.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    private UserDAO userDAO;

    public  UserServiceImpl(UserDAO theUserDAO){
        userDAO = theUserDAO;
    }
    @Override
    public List<User> findAll() {
        return userDAO.findAll();
    }
}
