package com.damilah.coffeeShop.coffeeShop.service.Coffee;

import com.damilah.coffeeShop.coffeeShop.dao.CoffeeRepository;
import com.damilah.coffeeShop.coffeeShop.entity.Coffee;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CoffeeServiceImpl implements CoffeeService{

    private CoffeeRepository coffeeRepository;

    public  CoffeeServiceImpl(CoffeeRepository theCoffeeRepository){
        coffeeRepository = theCoffeeRepository;
    }
    @Override
    public List<Coffee> findAll() {
        return coffeeRepository.findAll();
    }

    @Override
    public Coffee findById(int theId) {
        return coffeeRepository.findById(theId)
                .orElseThrow(() -> new RuntimeException("Did not find coffee id - " + theId));
    }
    @Override
    public List<Coffee> findCoffeesWithIngredientName(int ingredientName) {
        return coffeeRepository.findCoffeesWithIngredientName(ingredientName);
    }

    @Override
    public Coffee save(Coffee theCoffee) {
        return coffeeRepository.save(theCoffee);
    }

    @Override
    public void deleteById(int theId) {
        coffeeRepository.deleteById(theId);
    }
}

//
//@Service
//public class UserServiceImpl implements UserService{
//
//    private UserRepository userRepository;
//
//    public  UserServiceImpl(UserRepository theUserRepository){
//        userRepository = theUserRepository;
//    }
//    @Override
//    public List<User> findAll() {
//        return userRepository.findAll();
//    }
//
//
//
//    @Override
//    public User save(User theUser) {
//        return userRepository.save(theUser);
//    }
//
//    @Override
//    public void deleteById(int theId) {
//        userRepository.deleteById(theId);
//    }
//}
