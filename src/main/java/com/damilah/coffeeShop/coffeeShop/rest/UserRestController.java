package com.damilah.coffeeShop.coffeeShop.rest;

import com.damilah.coffeeShop.coffeeShop.entity.User;
import com.damilah.coffeeShop.coffeeShop.service.User.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class UserRestController {

    private UserService userService;

    public UserRestController(UserService theUserService){
        userService = theUserService;
    }

    @GetMapping("/users")
    public List<User> findAll(){
        return userService.findAll();
    }
}
