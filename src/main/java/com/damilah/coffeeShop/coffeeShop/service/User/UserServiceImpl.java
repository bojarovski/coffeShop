package com.damilah.coffeeShop.coffeeShop.service.User;

import com.damilah.coffeeShop.coffeeShop.dao.User.UserDAO;
import com.damilah.coffeeShop.coffeeShop.entity.User;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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

    @Override
    public User findById(int theId) {
        return userDAO.findById(theId);
    }

    @Transactional
    @Override
    public User save(User theUser) {
        return userDAO.save(theUser);
    }

    @Transactional
    @Override
    public void deleteById(int theId) {
        userDAO.deleteById(theId);
    }
}
