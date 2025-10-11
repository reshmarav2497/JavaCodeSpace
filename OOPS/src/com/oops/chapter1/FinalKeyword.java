package com.oops.chapter1;

public class FinalKeyword {
    public static void main(String[] args) {

        //------Final keyword usage-----------

        //1)Primitives
        final int a = 10;
        //a = 20; X -> No reassignment

        //2)Objects
        final Labor l1 = new Labor();
        l1.name = "Rohan"; // can modify the object fields
        l1.age = 40;

        //l1 = new Labor(); X -> No reassignment

        //3)Wrapper classes and String
        //Wrapper classes and strings are immutable by design
        final Integer num1 = 20;
        //num1 = 10; X -> No reassignment
        //num1.value = 19; X -> Impossible

    }


}

class Labor{
    String name;
    int age;
}

class FactoryLabors{
    String name;
    int age;

    //final methods cannot be overridden by subclasses
    final void show(){
        System.out.println("show from Factory Labors class");
    }
}

class Labor1 extends FactoryLabors{
    //void show(){} X -> No reassignment
}

final class Constants{}

//final class cannot be inherited
//class Myclass extends Constants{}