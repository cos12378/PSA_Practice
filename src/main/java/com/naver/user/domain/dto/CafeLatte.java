package com.naver.user.domain.dto;

import com.naver.annotation.CoffeeMaker;
import com.naver.annotation.CoffeeName;
import com.naver.annotation.CoffeePrice;

public class CafeLatte {
    @CoffeeName(coffeeName = CoffeeName.Coffee.CAFELATTE)
    private String cafelatteName;

    @CoffeePrice(price = 3000)
    private int coffeePrice;

    @CoffeeMaker(coffeeMaker = CoffeeMaker.Blending.홀빈)
    private String cafelatteProvider;

    public String getCafelatteName() {
        return cafelatteName;
    }

    public void setCafelatteName(String cafelatteName) {
        this.cafelatteName = cafelatteName;
    }

    public int getCoffeePrice() {
        return coffeePrice;
    }

    public void setCoffeePrice(int coffeePrice) {
        this.coffeePrice = coffeePrice;
    }

    public String getCafelatteProvider() {
        return cafelatteProvider;
    }

    public void setCafelatteProvider(String cafelatteProvider) {
        this.cafelatteProvider = cafelatteProvider;
    }
}
