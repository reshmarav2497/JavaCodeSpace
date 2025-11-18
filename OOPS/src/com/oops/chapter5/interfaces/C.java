package com.oops.chapter5.interfaces;

public class C implements A, B{

    @Override
    public void print() {
        System.out.println("print from C");
    }

    @Override
    public void showMsg() {
        System.out.println("Hi from C");
    }

    public int getSquare(int n){
        return A.square(n);
    }
}
