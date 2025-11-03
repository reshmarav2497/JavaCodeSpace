package com.oops.chapter3.inheritance;

import com.oops.chapter4.accessmod.Student;

public class Student1 extends Student {

    int id;

    Student1(){
        id = 2;
    }

    public void callStudy(){
        study();
    }
}
