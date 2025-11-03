package com.oops.chapter3.encapsulation;

public class Main {
    public static void main(String[] args) {
        //Polymorphism

        //Can only access properties through objects
        //by using public methods provided by the class

        Student s1 = new Student();
        s1.setName("Rohan");
        s1.setAge(21);

        System.out.println(s1.getName() + " " + s1.getAge());
    }
}
