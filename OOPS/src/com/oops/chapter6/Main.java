package com.oops.chapter6;

public class Main {
    public static void main(String[] args) {
        List items = new List();

        items.add(1);
        System.out.println(items.get(0));

        GenericList<Integer> items1 = new GenericList<>();
        items1.add(1);
        items1.add(2);

        System.out.println(items1.get(1));

        items1.printData(10);
        items1.printData("Hello");

    }
}
