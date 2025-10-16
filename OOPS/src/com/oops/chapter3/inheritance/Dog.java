package com.oops.chapter3.inheritance;

public class Dog extends Animal{
    String name;

    Dog(){
        super(20);
        this.name = "Unknown";
        System.out.println("Dog default constructor called");
    }

    Dog(int age, String name){
        super(age);
        this.name = name;
    }

    void eat(){
        super.eat("Dog");
    }
}
