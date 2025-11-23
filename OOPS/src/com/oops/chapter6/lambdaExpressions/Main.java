package com.oops.chapter6.lambdaExpressions;

public class Main {
    public static void main(String[] args) {

        Calculator add = (a, b) -> a + b;

        Calculator mul = (a, b) -> a * b;

        Calculator sub = (a, b) -> a - b;

        Calculator div = (a, b) -> {
            if(b <= 0) return -1;
            return a/b;
        };

        System.out.println("Addition => " + add.operation(10, 20));
        System.out.println("Subtraction => " + sub.operation(10, 20));
        System.out.println("Multiplication => " + mul.operation(10, 20));

        System.out.println("Division => " + div.operation(10, 20));

    }
}
