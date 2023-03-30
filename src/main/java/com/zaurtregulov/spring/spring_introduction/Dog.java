package com.zaurtregulov.spring.spring_introduction;

import org.springframework.stereotype.Component;

@Component
public class Dog implements Pet{

    private String name;

    public Dog() {
        System.out.println("Dog bean created");
    }

    @Override
    public void say(){
        System.out.println("Woof-woof");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void init(){
        System.out.println("Init method");
    }

    public void destroy(){
        System.out.println("Destroy method");
    }
}
