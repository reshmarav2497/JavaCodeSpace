package com.oops.chapter4.objectdemo;

public class Main {
    public static void main(String[] args) {
        Objects obj1 = new Objects(1, "Rashi");
        Objects obj2 = new Objects(2, "Rohan");
        Objects obj3 = new Objects(1, "Rashi");

        System.out.println(obj1.toString());

        System.out.println(obj1.equals(obj2));

        System.out.println(obj1.equals(obj3));

        System.out.println("hashcode of obj1 => " + obj1.hashCode());

        System.out.println("class name of obj2 => " + obj2.getClass().getSimpleName());
        System.out.println("class name of obj2 => " + obj2.getClass().getName());
        System.out.println("class name of obj2 => " + obj2.getClass().getCanonicalName());
        System.out.println("class name of obj2 => " + obj2.getClass().getPackage());

        //instanceOf
        Dog d = new Dog();
        System.out.println("is dog an instance of Animal " + (d instanceof Animal));

        Animal a = new Dog();

        //safe down casting
        if (a instanceof Dog) {
            Dog d1 = (Dog) a;  // safe down casting
            System.out.println("Downcast successful!");
        }

        //null instanceOf AnyClass => Always false
        d = null;
        System.out.println(d instanceof Dog);
    }
}
