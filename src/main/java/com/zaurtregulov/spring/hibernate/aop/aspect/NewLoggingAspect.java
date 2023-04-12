package com.zaurtregulov.spring.aop.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class NewLoggingAspect {

    @Around("execution(public String returnBookName())")
    public Object aroundReturnBookNameLoggingAdvice(ProceedingJoinPoint proceedingJoinPoint)
            throws Throwable {
        System.out.println("Начало advice");

//        Object targetMethodResult = null;
//
//        try {
//            targetMethodResult = proceedingJoinPoint.proceed();
//            targetMethodResult = "Можно поменять название книги";
//        } catch (Exception e) {
//            System.out.println("Поймано " + e);
//            targetMethodResult = "Неизвестная книга";
//        }

        Object targetMethodResult = null;

        try {
            targetMethodResult = proceedingJoinPoint.proceed();
            targetMethodResult = "Можно поменять название книги";
        } catch (Exception e) {
            System.out.println("Поймано " + e);
            throw e;
        }

        System.out.println("Конец advice");
        return targetMethodResult;
    }
}
