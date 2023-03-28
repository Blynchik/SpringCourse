package com.zaurtregulov.spring.spring_introduction;

public class Person {
    private Pet pet;

//    public Person(Pet pet) {
//        System.out.println("Person bean created");
//        this.pet = pet;
//    }


    public Person() {
        System.out.println("Person bean created");
    }

    public void callPet(){
        System.out.println("Hey");
        pet.say();
    }

    public void setPet(Pet pet) {
        System.out.println("Set pet");
        this.pet = pet;
    }
}
