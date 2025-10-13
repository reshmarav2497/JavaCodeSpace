package com.oops.chapter2;

public class Main {

    static double piVal;

    //Called only once when class is loaded
    //used to initialize static variables
    static {
        piVal = 3.14;
        System.out.println("Static block called.");
    }

    //A static method --> belongs to class Main
    static int getSum(int a, int b){
        return a + b;
    }

    //static members can only access static members
    //while objects can access both static and no static members

    public static void main(String[] args) {
        Human h1 = new Human("Rohan", 23, 20000, false);
        System.out.println(h1.marriageAge);


        Human h2 = new Human("Roshni", 24, 50000, true);
        h2.marriageAge = 23; //common property for all objects
        System.out.println(h1.marriageAge);

        //Static methods can be called directly without creating an object
        System.out.println(Main.getSum(10,15));

        System.out.println(Main.piVal);

        //What happens when you print an object
        //It will internally call toString method
        //If it does not find the toString method in object reference it will call toString of java
        System.out.println(h1);
    }

}
