package com.oops.chapter5.abstractdemo;

public class Main {
    public static void main(String[] args) {

        //Cannot instantiate an abstract class
        //Animal animal = new Animal("mouse");

        Animal a = new Dog("Doggy");
        a.sound();

        Animal c = new Cat("Tommy");
        c.sound();

        a.sleep();
    }
}
