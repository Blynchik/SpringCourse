package com.zaurtregulov.spring.aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(3)
public class ExceptionHandlingAspect {

    @Before("com.zaurtregulov.spring.aop.aspect.MyPointcuts.allGetMethods()")
    public void beforeGetExceptionHandlingAdvice(){
        System.out.println("Ловим исключение");
    }
}
