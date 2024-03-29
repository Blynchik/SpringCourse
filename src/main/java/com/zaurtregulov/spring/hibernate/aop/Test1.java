package com.zaurtregulov.spring.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test1 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);

        UniLibrary library = context.getBean("uniLibrary", UniLibrary.class);
//        library.getBook("Словарь");
        Book book = context.getBean("book", Book.class);
        library.getBook();
//        library.returnBook();
        library.addBook("Person", book);
        library.getMagazine();
        library.addMagazine();
//        library.returnMagazine();
//        library.addBook();

//        SchoolLibrary schoolLibrary = context.getBean("schoolLibrary",
//                SchoolLibrary.class);
//        schoolLibrary.getBook();

        context.close();
    }
}
