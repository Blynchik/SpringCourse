package com.zaurtregulov.spring.aop.aspect;

import org.aspectj.lang.annotation.Pointcut;

public class MyPointcuts {

//    @Pointcut("execution(* get*())")
//    public void allGetMethods() {
//    }

    @Pointcut("execution(* abd*(..))")
    public void allAddMethods() {
    }
}
