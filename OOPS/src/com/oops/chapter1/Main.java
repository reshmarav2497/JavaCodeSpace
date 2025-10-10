package com.oops.chapter1;

public class Main {
    public static void main(String[] args) {
        //use new keyword to create an object
        Student s1 = new Student();
        s1.name = "Rohan";
        s1.rollNo = 1;
        s1.marks = 92f;
        s1.read();
        System.out.println(s1.name + " of roll no." + s1.rollNo + " obtained percentile " +  s1.marks);
    }
}

//class should follow upper camel case
class Student {
    int rollNo;
    String name;
    float marks;

    void read(){
        System.out.println(name + " is Reading.");
    }
}
