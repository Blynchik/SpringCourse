package com.zaurtregulov.spring.aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(5)
public class SecurityAspect {

    @Before("com.zaurtregulov.spring.aop.aspect.MyPointcuts.allAddMethods()")
    public void beforeAddSecurityAdvice() {
        System.out.println("Проверка прав");
    }
}
