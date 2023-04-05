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

        long begin = System.currentTimeMillis();

        Object targetMethodResult = proceedingJoinPoint.proceed();
        targetMethodResult = "Можно поменять название книги";

        long end = System.currentTimeMillis();

        System.out.println("Конец advice");
        System.out.println("returnBookName выполнился за " + (end - begin) + "ms");
        return targetMethodResult;
    }
}
