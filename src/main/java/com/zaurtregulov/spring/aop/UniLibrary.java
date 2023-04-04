package com.zaurtregulov.spring.aop;

import org.springframework.stereotype.Component;

import java.util.stream.Stream;

@Component
public class UniLibrary extends AbstractLibrary {

    public void getBook() {
        System.out.println("Мы берем книгу из UniLibrary");
        System.out.println("=============================");
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
        System.out.println("=============================");
    }

    public void getMagazine( ) {
        System.out.println("Мы берем журнал из UniLibrary");
        System.out.println("=============================");
    }

    public void returnMagazine(){
        System.out.println("Возвращаем журнал в UniLibrary");
        System.out.println("=============================");
    }

    public void addBook(String personName, Book book){
        System.out.println("Добавляем книгу в UniLibrary");
        System.out.println("=============================");
    }

    public void addMagazine(){
        System.out.println("Добавляем журнал в UniLibrary");
        System.out.println("=============================");
    }

//    public void getBook(String bookName) {
//        System.out.println("Мы берем книгу из UniLibrary " + bookName);
//    }
//
//    public void getBook(Book book){
//        System.out.println("Мы берем " + book.getName());
//    }
}
