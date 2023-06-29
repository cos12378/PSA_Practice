package com.naver.user.dao;


import com.naver.annotation.CoffeeMaker;
import com.naver.annotation.CoffeeName;
import com.naver.annotation.CoffeePrice;
import com.naver.annotation.CoffeeProvider;

import java.lang.reflect.Field;

public class CoffeeInfo {
    public static void getCoffeeInfo(Class<?> clazz) {
        String strCoffeeName = " 커피 이름:";
        String strCoffeePrice = " 커피 가격:";
        String strCoffeeMaker = " 커피 블렌딩:";
        String strCoffeeProvider;

        Field[] fields = clazz.getDeclaredFields();

        for (Field field : fields) {
            if(field.isAnnotationPresent(CoffeeName.class)) {
                CoffeeName coffeeName = field.getAnnotation(CoffeeName.class);
                strCoffeeName = strCoffeeName + coffeeName.coffeeName().toString();
                System.out.println(strCoffeeName);
            } else if (field.isAnnotationPresent(CoffeePrice.class)) {
                CoffeePrice coffeePrice = field.getAnnotation(CoffeePrice.class);
                strCoffeePrice = strCoffeePrice + coffeePrice.price();
                System.out.println(strCoffeePrice);
            } else if (field.isAnnotationPresent(CoffeeMaker.class)) {
                CoffeeMaker coffeeMaker = field.getAnnotation(CoffeeMaker.class);
                strCoffeeMaker = strCoffeeMaker + coffeeMaker.coffeeMaker().toString();
                System.out.println(strCoffeeMaker);
            }   else if (field.isAnnotationPresent(CoffeeProvider.class)) {
                CoffeeProvider coffeeProvider = field.getAnnotation(CoffeeProvider.class);
                strCoffeeProvider = " 커피 판매점 id: "+  coffeeProvider.id() + " 판매점 이름: "+ coffeeProvider.store()+ "제조 시간: "+ coffeeProvider.createTime();
                System.out.println(strCoffeeProvider);
            }

        }
    }
}
