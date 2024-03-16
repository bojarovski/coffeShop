package com.damilah.coffeeShop.coffeeShop.rest;

import com.damilah.coffeeShop.coffeeShop.entity.Coffee;
import com.damilah.coffeeShop.coffeeShop.entity.User;
import com.damilah.coffeeShop.coffeeShop.service.Coffee.CoffeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class CoffeeRestController {
    private CoffeeService coffeeService;

    @Autowired
    public CoffeeRestController(CoffeeService theCoffeeService){
        coffeeService = theCoffeeService;
    }


    @CrossOrigin(origins = "http://localhost:8080")
    @GetMapping("/coffees")
    public List<Coffee> findAll(){
        return coffeeService.findAll();
    }

    @GetMapping("/coffees/{ingredientName}")
    public List<Coffee> getCoffeesWithIngredient(@PathVariable int ingredientName) {
        List<Coffee> coffees = coffeeService.findCoffeesWithIngredientName(ingredientName);
        if (coffees.isEmpty()) {
            throw new RuntimeException("Error");
        }
        return coffees;
    }

    @PostMapping("/coffees")
    public Coffee addCoffee(@RequestBody Coffee theCoffee){

        theCoffee.setId(0);
        return coffeeService.save(theCoffee);
    }

    @DeleteMapping("/coffees/{coffeeId}")
    public String deleteUser(@PathVariable int coffeeId){

        Coffee theCoffee = coffeeService.findById(coffeeId);
        if(theCoffee == null){
            throw new RuntimeException("Coffee Not Found");
        }
        coffeeService.deleteById(coffeeId);
        return "Coffee is deleted successfully";
    }

}


//package com.damilah.coffeeShop.coffeeShop.rest;
//
//import com.damilah.coffeeShop.coffeeShop.entity.User;
//import com.damilah.coffeeShop.coffeeShop.service.User.UserService;
//import org.springframework.web.bind.annotation.*;
//
//        import java.util.List;
//
//@RestController
//@RequestMapping("/api")
//public class UserRestController {
//
//    private UserService userService;
//
//    public UserRestController(UserService theUserService){
//        userService = theUserService;
//    }
//
//    @GetMapping("/users")
//    public List<User> findAll(){
//        return userService.findAll();
//    }
//
//    @GetMapping("/user/{userId}")
//    public User getUser(@PathVariable int userId){
//        User theUser = userService.findById(userId);
//        if(theUser == null){
//            throw new RuntimeException("Employee Not Found");
//        }
//        return  theUser;
//    }
//
//    @PostMapping("/user")
//    public User addUser(@RequestBody User theUser){
//
//        theUser.setId(0);
//        return userService.save(theUser);
//    }
//
//    @PutMapping("/user")
//    public User updateUser(@RequestBody User theUser){
//
//        return userService.save(theUser);
//    }
//
//    @DeleteMapping("/user/{userId}")
//    public String deleteUser(@PathVariable int userId){
//
//        User theUser = userService.findById(userId);
//        if(theUser == null){
//            throw new RuntimeException("User Not Found");
//        }
//        userService.deleteById(userId);
//        return "User is deleted successfully";
//    }
//}
