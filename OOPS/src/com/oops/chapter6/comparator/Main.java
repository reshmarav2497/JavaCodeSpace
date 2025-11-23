package com.oops.chapter6.comparator;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student(22, "Alex"));
        list.add(new Student(21, "Rohan"));
        list.add(new Student(19, "Bob"));
        list.add(new Student(18, "Michal"));
        list.add(new Student(29, "Virat"));
        list.add(new Student(20, "Karan"));

        System.out.println("--------based on name------------");

        Collections.sort(list, new NameComparator());


        for(Student s : list){
            System.out.println(s.name + " " + s.age);
        }

        System.out.println("--------based on age------------");

        Collections.sort(list, new AgeComparator());

        for(Student s : list){
            System.out.println(s.name + " " + s.age);
        }
    }

}
