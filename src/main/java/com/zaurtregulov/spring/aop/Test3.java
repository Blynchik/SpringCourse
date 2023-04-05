package com.zaurtregulov.spring.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test3 {

    public static void main(String[] args) {
        System.out.println("Method main");

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);

        UniLibrary library = context.getBean("uniLibrary", UniLibrary.class);
        String name = library.returnBookName();
        System.out.println(name);

        context.close();

        System.out.println("Method main ends");
    }
}
