package com.damilah.coffeeShop.coffeeShop.entity;

import jakarta.persistence.*;

@Entity
@Table(name="coffee_ingredient")
public class CoffeeIngredient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "coffee_id")
    private String coffeeId;

    @Column(name = "ingredient_id")
    private String ingredientId;

    @Column(name = "quantity")
    private String quantity;

    public CoffeeIngredient (){}

    public CoffeeIngredient(String coffeeId, String ingredientId, String quantity) {
        this.coffeeId = coffeeId;
        this.ingredientId = ingredientId;
        this.quantity = quantity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCoffeeId() {
        return coffeeId;
    }

    public void setCoffeeId(String coffeeId) {
        this.coffeeId = coffeeId;
    }

    public String getIngredientId() {
        return ingredientId;
    }

    public void setIngredientId(String ingredientId) {
        this.ingredientId = ingredientId;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "CoffeeIngredient{" +
                "id=" + id +
                ", coffeeId='" + coffeeId + '\'' +
                ", ingredientId='" + ingredientId + '\'' +
                ", quantity='" + quantity + '\'' +
                '}';
    }
}
