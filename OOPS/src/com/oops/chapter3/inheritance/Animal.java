package com.oops.chapter3.inheritance;

public class Animal {
    int lifeSpan;
    private String gender;

    Animal(){
        lifeSpan = 0;
        gender = "unKnown";
        System.out.println("Animal default constructor called");
    }

    Animal(int lifeSpan){
        this.lifeSpan = lifeSpan;
        System.out.println("Animal parameterised constructor called");
    }

    void eat() {
        System.out.println("Animal eats");
    }

    void eat(String animal){
        System.out.println(animal + " eats");
    }
}


