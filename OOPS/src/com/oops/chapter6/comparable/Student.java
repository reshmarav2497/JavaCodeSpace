package com.oops.chapter6.comparable;

public class Student implements Comparable<Student>{

    int age;
    String name;

    Student(int age, String name){
        this.age = age;
        this.name = name;
    }

    // 0 -> both the objects are equal
    // +ve -> current object is greater
    // -ve -> current object is smaller
    @Override
    public int compareTo(Student o) {
        return this.age - o.age; // ascending
        //return  o.age - this.age // descending
    }
}
