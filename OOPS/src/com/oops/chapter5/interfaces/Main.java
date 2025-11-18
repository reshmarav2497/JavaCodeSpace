package com.oops.chapter5.interfaces;

public class Main {
    public static void main(String[] args) {
        C c = new C();

        c.showMsg();
        c.print();

        System.out.println(c.getSquare(8));

        Circle circle = new Circle(2);

        System.out.println(circle.area());
    }
}
