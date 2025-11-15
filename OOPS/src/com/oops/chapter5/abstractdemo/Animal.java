package com.oops.chapter5.abstractdemo;

abstract class Animal {

    public String name;

    Animal(String name){
        this.name = name;
        System.out.println("Animal Constructor called.");

    }

    abstract void sound();

    public void sleep(){
        System.out.println("Sleeping");
    }

}