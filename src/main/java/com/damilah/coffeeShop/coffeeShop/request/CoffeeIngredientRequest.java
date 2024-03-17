package com.damilah.coffeeShop.coffeeShop.request;

import java.util.List;

public class CoffeeIngredientRequest {
    private Integer coffee_id;
    private List<Integer> ingredient_ids;
    private Integer quantity;

    public CoffeeIngredientRequest(){}

    public Integer getCoffee_id() {
        return coffee_id;
    }

    public void setCoffee_id(Integer coffee_id) {
        this.coffee_id = coffee_id;
    }

    public List<Integer> getIngredient_ids() {
        return ingredient_ids;
    }

    public void setIngredient_ids(List<Integer> ingredient_ids) {
        this.ingredient_ids = ingredient_ids;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
}
