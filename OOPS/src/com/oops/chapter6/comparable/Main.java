package com.oops.chapter6.comparable;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        //comparable usage via sort
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student(22, "Alex"));
        list.add(new Student(21, "Rohan"));
        list.add(new Student(19, "Ron"));

        Collections.sort(list);

        for(Student s : list){
            System.out.println(s.name + " " + s.age);
        }


    }

}
