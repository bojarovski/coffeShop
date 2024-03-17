package com.damilah.coffeeShop.coffeeShop.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="ingredient")
public class Ingredient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;


//    @JsonIgnore
//    @ManyToMany(fetch = FetchType.LAZY,
//            cascade = {CascadeType.PERSIST, CascadeType.MERGE,
//                    CascadeType.DETACH, CascadeType.REFRESH})
//    @JoinTable(name = "coffee_ingredient",
//    joinColumns = @JoinColumn(name = "ingredient_id"),
//    inverseJoinColumns = @JoinColumn(name= "coffee_id"))
//    private List<Coffee> coffees;
    public Ingredient(){}

    public Ingredient(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

//    public List<Coffee> getCoffees() {
//        return coffees;
//    }
//
//    public void setCoffees(List<Coffee> coffees) {
//        this.coffees = coffees;
//    }
//
////    Add convenient method for add Coffee
//    public void addCoffee(Coffee theCoffee){
//        if(coffees == null ){
//            coffees = new ArrayList<>();
//        }
//        coffees.add(theCoffee);
//    }


    @Override
    public String toString() {
        return "Ingredient{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
