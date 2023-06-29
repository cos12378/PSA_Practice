package com.naver.user.domain.dto;

import com.naver.annotation.CoffeeMaker;
import com.naver.annotation.CoffeeName;
import com.naver.annotation.CoffeePrice;

public class Espresso {
    @CoffeeName(coffeeName = CoffeeName.Coffee.ESPRESSO)
    private String espressoName;

    @CoffeePrice(price = 3000)
    private int coffeePrice;

    @CoffeeMaker(coffeeMaker = CoffeeMaker.Blending.모카포트)
    private String espressoProvider;

    public String getEspressoName() {
        return espressoName;
    }

    public void setEspressoName(String espressoName) {
        this.espressoName = espressoName;
    }

    public int getCoffeePrice() {
        return coffeePrice;
    }

    public void setCoffeePrice(int coffeePrice) {
        this.coffeePrice = coffeePrice;
    }

    public String getEspressoProvider() {
        return espressoProvider;
    }

    public void setEspressoProvider(String espressoProvider) {
        this.espressoProvider = espressoProvider;
    }
}
