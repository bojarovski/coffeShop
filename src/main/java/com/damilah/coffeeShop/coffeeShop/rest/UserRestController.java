package com.damilah.coffeeShop.coffeeShop.rest;

import com.damilah.coffeeShop.coffeeShop.entity.User;
import com.damilah.coffeeShop.coffeeShop.service.User.UserService;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/user/{userId}")
    public User getUser(@PathVariable int userId){
       User theUser = userService.findById(userId);
        if(theUser == null){
           throw new RuntimeException("Employee Not Found");
        }
        return  theUser;
    }

    @PostMapping("/user")
    public User addUser(@RequestBody User theUser){

        theUser.setId(0);
        return userService.save(theUser);
    }

    @PutMapping("/user")
    public User updateUser(@RequestBody User theUser){

        return userService.save(theUser);
    }

    @DeleteMapping("/user/{userId}")
    public String deleteUser(@PathVariable int userId){

        User theUser = userService.findById(userId);
        if(theUser == null){
            throw new RuntimeException("User Not Found");
        }
        userService.deleteById(userId);
        return "User is deleted successfully";
    }
}
