package com.zaurtregulov.spring.aop;

import org.springframework.stereotype.Component;

import java.util.stream.Stream;

@Component
public class UniLibrary extends AbstractLibrary {

    @Override
    public void getBook() {
        System.out.println("Мы берем книгу из UniLibrary");
    }

//    public void returnBook(){
//        System.out.println("Возвращаем книгу в UniLibrary");
//    }

//    public String returnBook(){
//        System.out.println("Возвращаем книгу в UniLibrary");
//        return "OK";
//    }

    protected void returnBook() {
        System.out.println("Возвращаем книгу в UniLibrary");
    }

    public void getMagazine() {
        System.out.println("Мы берем журнал из UniLibrary");
    }
}
