package com.zaurtregulov.spring.aop;

import org.springframework.stereotype.Component;

import java.util.stream.Stream;

@Component
public class UniLibrary extends AbstractLibrary {

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

    public void getMagazine(int a) {
        System.out.println("Мы берем журнал из UniLibrary");
    }

    public void getBook(String bookName) {
        System.out.println("Мы берем книгу из UniLibrary " + bookName);
    }

    public void getBook(Book book){
        System.out.println("Мы берем " + book.getName());
    }
}
