package com.zaurtregulov.spring.aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAndSecurityAspect {

    @Pointcut("execution(* com.zaurtregulov.spring.aop.UniLibrary.*(..))")
    private void allMethodFromUniLibrary() {
    }

    @Pointcut("execution (public void com.zaurtregulov.spring.aop.UniLibrary.returnMagazine())")
    private void returnMagazineFromUniLibrary() {
    }

    @Pointcut("allMethodFromUniLibrary() && !returnMagazineFromUniLibrary()")
    private void allMethodsExceptReturnMagazineFromUniLibrary(){
    }

    @Before("allMethodsExceptReturnMagazineFromUniLibrary()")
    public void beforeAllMethodsExceptReturnMagazineAdvice(){
        System.out.println("Log 100");
    }

//    @Pointcut("execution(* com.zaurtregulov.spring.aop.UniLibrary.get*())")
//    private void allGetMethodsFromUniLibrary() {
//    }
//
//    @Pointcut("execution(* com.zaurtregulov.spring.aop.UniLibrary.return*())")
//    private void allReturnMethodsFromUniLibrary(){
//    }
//
//    @Pointcut("allGetMethodsFromUniLibrary() || allReturnMethodsFromUniLibrary()")
//    private void allGetAndReturnMethodsFromUniLibrary(){
//    }
//
//    @Before("allGetMethodsFromUniLibrary()")
//    public void beforeGetLoggingAdvice() {
//        System.out.println("Log 1");
//    }
//
//    @Before("allReturnMethodsFromUniLibrary()")
//    public void beforeReturnLoggingAdvice(){
//        System.out.println("Log 2");
//    }
//
//    @Before("allGetAndReturnMethodsFromUniLibrary()")
//    public void beforeGetAndReturnLoggingAdvice() {
//        System.out.println("Log 3");
//    }

//    @Pointcut("execution(* get*())")
//    private void allGetMethods() {
//    }
//
//    //        @Before("execution(public void getBook(String))")
////    @Before("execution(public void *(*))")
////    @Before("execution(public void *(..))")
////    @Before("execution(public void getBook(com.zaurtregulov.spring.aop.Book))")
////@Before("execution(public void com.zaurtregulov.spring.aop.UniLibrary.getBook())")
////    @Before("execution(public void get*())")
////    @Before("execution(* get*())")
//
//    @Before("allGetMethods()")
//    public void beforeGetLoggingAdvice() {
//        System.out.println("Попытка получить книгу/журнал");
//    }
//
//    //    @Before("execution(public void returnBook())")
////    @Before("execution(public * returnBook())")
//    @Before("execution(* returnBook())")
//    public void beforeReturnBookAdvice() {
//        System.out.println("Попытка вернуть книгу");
//    }
//
//    //    @Before("execution(* get*())")
//    @Before("allGetMethods()")
//    public void beforeGetSecurityAdvice() {
//        System.out.println("Проверка прав");
//    }
}
