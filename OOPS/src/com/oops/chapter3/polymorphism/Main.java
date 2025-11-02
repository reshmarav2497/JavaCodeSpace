package com.oops.chapter3.polymorphism;

public class Main {
    public static void main(String[] args) {
        Shapes shapes = new Shapes();
        shapes.area();

        //at run time the object type will decide which method to call
        Shapes circle = new Circle();
        circle.area();

        Shapes square = new Square();
        square.area();
    }
}
