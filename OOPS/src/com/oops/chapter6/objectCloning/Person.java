package com.oops.chapter6.objectCloning;

class Address implements Cloneable{
    String city;

    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}
public class Person implements Cloneable{
    String name;
    int age;
    Address add;

    @Override
    public Object clone() throws CloneNotSupportedException{
        //return super.clone();
        Person p = (Person) super.clone();
        p.add = (Address) add.clone(); //deep copy
        return p;
    }
}
