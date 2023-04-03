package com.zaurtregulov.spring.aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAndSecurityAspect {

    @Pointcut("execution(* get*())")
    private void allGetMethods() {
    }

    //        @Before("execution(public void getBook(String))")
//    @Before("execution(public void *(*))")
//    @Before("execution(public void *(..))")
//    @Before("execution(public void getBook(com.zaurtregulov.spring.aop.Book))")
//@Before("execution(public void com.zaurtregulov.spring.aop.UniLibrary.getBook())")
//    @Before("execution(public void get*())")
//    @Before("execution(* get*())")

    @Before("allGetMethods()")
    public void beforeGetLoggingAdvice() {
        System.out.println("Попытка получить книгу/журнал");
    }

    //    @Before("execution(public void returnBook())")
//    @Before("execution(public * returnBook())")
    @Before("execution(* returnBook())")
    public void beforeReturnBookAdvice() {
        System.out.println("Попытка вернуть книгу");
    }

    //    @Before("execution(* get*())")
    @Before("allGetMethods()")
    public void beforeGetSecurityAdvice() {
        System.out.println("Проверка прав");
    }
}
