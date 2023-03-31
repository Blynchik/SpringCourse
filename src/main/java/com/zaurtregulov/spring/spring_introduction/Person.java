package com.zaurtregulov.spring.spring_introduction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Person {
    @Autowired
    @Qualifier("dog")
    private Pet pet;

//    @Value("Surname")
    @Value("${person.surname}")
    private String surname;

//    @Value("33")
    @Value("${person.age}")
    private int age;

//    @Autowired
//    public Person(@Qualifier("dog") Pet pet) {
//        System.out.println("Person bean created");
//        this.pet = pet;
//    }


    public Person() {
        System.out.println("Person bean created");
    }

    public void callPet() {
        System.out.println("Hey");
        pet.say();
    }

    //    @Autowired
    //    @Qualifier("dog")
    public void setPet(Pet pet) {
        System.out.println("Set pet");
        this.pet = pet;
    }

    public String getSurname() {
        return surname;
    }


    public void setSurname(String surname) {
        System.out.println("Set surname");
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        System.out.println("Set age");
        this.age = age;
    }
}
