package com.naver.user.domain.dto;

import com.naver.annotation.CoffeeMaker;
import com.naver.annotation.CoffeeName;
import com.naver.annotation.CoffeePrice;

public class Cappuccino {
    @CoffeeName(coffeeName = CoffeeName.Coffee.CAPPUCCINO)
    private String cappuccinoName;

    @CoffeePrice(price = 4000)
    private int coffeePrice;

    @CoffeeMaker(coffeeMaker = CoffeeMaker.Blending.드립)
    private String cappuccinoProvider;

    public String getCappuccinoName() {
        return cappuccinoName;
    }

    public void setCappuccinoName(String cappuccinoName) {
        this.cappuccinoName = cappuccinoName;
    }

    public int getCoffeePrice() {
        return coffeePrice;
    }

    public void setCoffeePrice(int coffeePrice) {
        this.coffeePrice = coffeePrice;
    }

    public String getCappuccinoProvider() {
        return cappuccinoProvider;
    }

    public void setCappuccinoProvider(String cappuccinoProvider) {
        this.cappuccinoProvider = cappuccinoProvider;
    }
}
