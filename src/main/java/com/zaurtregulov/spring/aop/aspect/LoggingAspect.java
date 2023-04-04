package com.zaurtregulov.spring.aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(1)
public class LoggingAspect {

//

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
//
//    //        @Before("execution(public void getBook(String))")
////    @Before("execution(public void *(*))")
////    @Before("execution(public void *(..))")
////    @Before("execution(public void getBook(com.zaurtregulov.spring.aop.Book))")
////@Before("execution(public void com.zaurtregulov.spring.aop.UniLibrary.getBook())")
////    @Before("execution(public void get*())")
////    @Before("execution(* get*())")
//
    @Before("com.zaurtregulov.spring.aop.aspect.MyPointcuts.allGetMethods()")
    public void beforeGetLoggingAdvice() {
        System.out.println("Попытка получить книгу/журнал");
    }
//
//    //    @Before("execution(public void returnBook())")
////    @Before("execution(public * returnBook())")
//    @Before("execution(* returnBook())")
//    public void beforeReturnBookAdvice() {
//        System.out.println("Попытка вернуть книгу");
//    }
//
//    //    @Before("execution(* get*())")
}
