package com.oops.chapter2;

public class Human {
    String name;
    int age;
    int salary;
    boolean isMarried;

    //static variables --> Belongs to a class Human and common to all objects
    //should be initialized
    static int marriageAge = 21;
    static int count = 0;

    @Override
    public String toString(){
        return name + " of age " + age + " gets a salary of " + salary + " and " + (isMarried ? "is " : "is not ") + "married";
    }

    Human(String name, int age, int salary, boolean isMarried){
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.isMarried = isMarried;

        //static members are accessed by class names
        Human.count += 1;
    }
}
