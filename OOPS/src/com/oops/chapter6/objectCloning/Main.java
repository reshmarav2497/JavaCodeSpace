package com.oops.chapter6.objectCloning;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Person p1 = new Person();
        p1.name = "Reshma";
        p1.age = 26;
        p1.add = new Address();
        p1.add.city = "Delhi";

        System.out.println("Address of p1 before => " + p1.add.city);

        Person p2 = (Person) p1.clone(); //shallow copy
        p2.add.city = "Mumbai";

        System.out.println("Address of p1 after => " + p1.add.city);

        System.out.println("Name of p2 => " + p2.name);
        System.out.println("Age of p2 => " + p2.age);
    }
}
