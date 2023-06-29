package com.naver.user.domain.dto;

import com.naver.annotation.CoffeeMaker;
import com.naver.annotation.CoffeeName;
import com.naver.annotation.CoffeePrice;
import com.naver.annotation.CoffeeProvider;

public class Americano {
    @CoffeeName(coffeeName = CoffeeName.Coffee.AMERICANO)
    private String americanoName;

    @CoffeePrice(price = 3000)
    private int coffeePrice;

    @CoffeeMaker(coffeeMaker = CoffeeMaker.Blending.모카포트)
    private String coffeeMaker;

    @CoffeeProvider(id=1, store = "STARBUCKS", createTime = 180)
    private String coffeeProvider;

    public String getAmericanoName() {
        return americanoName;
    }

    public void setAmericanoName(String americanoName) {
        this.americanoName = americanoName;
    }

    public int getCoffeePrice() {
        return coffeePrice;
    }

    public void setCoffeePrice(int coffeePrice) {
        this.coffeePrice = coffeePrice;
    }

    public String getCoffeeMaker() {
        return coffeeMaker;
    }

    public void setCoffeeMaker(String coffeeMaker) {
        this.coffeeMaker = coffeeMaker;
    }

    public String getCoffeeProvider() {
        return coffeeProvider;
    }

    public void setCoffeeProvider(String coffeeProvider) {
        this.coffeeProvider = coffeeProvider;
    }
}
