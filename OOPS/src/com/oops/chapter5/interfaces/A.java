package com.oops.chapter5.interfaces;

public interface A {

    //1) Abstract methods
    void print();

    //2) default methods
    default void showMsg(){
        System.out.println("Show msg from A");
    }

    //3) static methods
    static int square(int a){
        return a * a;
    }

    //4) private methods
    private float PI(){
        return 3.14f;
    }

}
