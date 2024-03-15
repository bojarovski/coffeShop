package com.damilah.coffeeShop.coffeeShop.service.User;

import com.damilah.coffeeShop.coffeeShop.dao.UserRepository;
import com.damilah.coffeeShop.coffeeShop.entity.User;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService{

    private UserRepository userRepository;

    public  UserServiceImpl(UserRepository theUserRepository){
        userRepository = theUserRepository;
    }
    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public User findById(int theId) {
       Optional<User> result = userRepository.findById(theId);
       User theUser = null;
       if (result.isPresent()){
           theUser=result.get();
       } else {
           throw new RuntimeException("Did not find employee id");
       }

        return theUser;
    }

    @Override
    public User save(User theUser) {
        return userRepository.save(theUser);
    }

    @Override
    public void deleteById(int theId) {
        userRepository.deleteById(theId);
    }
}
