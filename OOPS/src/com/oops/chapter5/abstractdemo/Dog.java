package com.oops.chapter5.abstractdemo;

public class Dog extends Animal{

    Dog(String name){
        super(name);
        System.out.println("Dog constructor called");
    }

    @Override
    public void sound(){
        System.out.println(name + " the dog barks");
    }
}
