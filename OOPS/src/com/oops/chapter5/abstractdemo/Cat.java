package com.oops.chapter5.abstractdemo;

public class Cat extends Animal {

    Cat(String name){
        super(name);
        System.out.println("Cat constructor called");
    }

    @Override
    void sound(){
        System.out.println(name + " the cat meows");
    }
}
