package com.naver.annotation;

import java.lang.annotation.*;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface CoffeeName{

    enum Coffee{AMERICANO,CAFELATTE,ESPRESSO,CAPPUCCINO}

    Coffee coffeeName() default  Coffee.AMERICANO;

}
