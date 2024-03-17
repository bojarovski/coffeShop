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
    private int coffeeId;

    @Column(name = "ingredient_id")
    private int ingredientId;

    @Column(name = "quantity")
    private int quantity;


   public CoffeeIngredient() {}

    public CoffeeIngredient(int coffeeId, int ingredientId, int quantity) {
        this.coffeeId = coffeeId;
        this.ingredientId = ingredientId;
        this.quantity = quantity;
    }

    public int getCoffeeId() {
        return coffeeId;
    }

    public void setCoffeeId(int coffeeId) {
        this.coffeeId = coffeeId;
    }

    public int getIngredientId() {
        return ingredientId;
    }

    public void setIngredientId(int ingredientId) {
        this.ingredientId = ingredientId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "CoffeeIngredient{" +
                "id=" + id +
                ", coffeeId=" + coffeeId +
                ", ingredientId=" + ingredientId +
                ", quantity=" + quantity +
                '}';
    }
}
