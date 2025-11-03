package com.oops.chapter4.accessmod;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();
        //private keyword
        //private members cannot be accessed outside of class
        //s1.marks;

        s1.setMarks(90);
        System.out.println("marks " + s1.getMarks());

        Teacher t1 = new Teacher();
        t1.teach();

        s1.study();
    }
}
