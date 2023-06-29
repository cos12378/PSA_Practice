package com.naver.annotation;

import java.lang.annotation.*;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface CoffeeProvider {


    int id() default -1;
    String store() default "";
    int createTime() default 0;
}
