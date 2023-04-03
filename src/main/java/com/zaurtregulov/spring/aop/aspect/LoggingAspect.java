package com.zaurtregulov.spring.aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {

    //    @Before("execution(public void getBook())")
//@Before("execution(public void com.zaurtregulov.spring.aop.UniLibrary.getBook())")
    @Before("execution(public void get*())")
    public void beforeGetBookAdvice() {
        System.out.println("Попытка получить книгу");
    }

    //    @Before("execution(public void returnBook())")
//    @Before("execution(public * returnBook())")
    @Before("execution(* returnBook())")
    public void beforeReturnBookAdvice() {
        System.out.println("Попытка вернуть книгу");
    }
}
