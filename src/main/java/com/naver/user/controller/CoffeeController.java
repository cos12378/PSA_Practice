package com.naver.user.controller;

import com.naver.user.dao.CoffeeInfo;

import java.util.Scanner;


import com.naver.annotation.CoffeeName;
import com.naver.user.dao.CoffeeInfo;
import com.naver.user.domain.dto.Americano;
import com.naver.user.domain.dto.CafeLatte;
import com.naver.user.domain.dto.Cappuccino;

import java.lang.reflect.Field;
import java.util.Scanner;

public class CoffeeController {
    public static void main(String[] args) {
        CoffeeInfo.getCoffeeInfo(CafeLatte.class);
    }
//        Scanner input = new Scanner(System.in);
//
//        System.out.println("Enter the coffee name: ");
//        String coffeeName = input.nextLine();
//
//        Class<CoffeeName.Coffee> coffeeNameClass = CoffeeName.Coffee.class;
//        Field[] fields = coffeeNameClass.getDeclaredFields();
//        boolean found = false;
//
//        for (Field field : fields) {
//            if (field.isAnnotationPresent(CoffeeName.class)) {
//                CoffeeName coffeeNameAnnotation = field.getAnnotation(CoffeeName.class);
//                if (coffeeNameAnnotation.coffeeName().getClass().equals(CoffeeName.class)) {
//                    found = true;
//                    break;
//                }
//            }
//        }
//
//        if (found) {
//            System.out.println("Coffee name is valid and found in the CoffeeName annotation.");
//            // Your desired logic to execute when the coffee name is valid.
//        } else {
//            System.out.println("Invalid coffee name or not found in the CoffeeName annotation.");
//            // Your desired logic to execute when the coffee name is invalid.
//        }
//    }
}

