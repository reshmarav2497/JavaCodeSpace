package com.oops.chapter3.encapsulation;

public class Student {

    //private properties
    private String name;
    private int age;

    //getter
    public String getName(){
        return name;
    }

    //setter
    public void setName(String name){
        this.name = name;
    }

    //getter
    public int getAge(){
        return age;
    }

    //setter
    public void setAge(int age){
        if(age > 0){
            this.age = age;
        }
    }
}
