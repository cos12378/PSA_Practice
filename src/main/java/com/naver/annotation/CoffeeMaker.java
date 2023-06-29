package com.naver.annotation;

import java.lang.annotation.*;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface CoffeeMaker {

    enum Blending{에쏘,더치,모카포트,드립,홀빈}

    Blending coffeeMaker() default Blending.모카포트;
}
