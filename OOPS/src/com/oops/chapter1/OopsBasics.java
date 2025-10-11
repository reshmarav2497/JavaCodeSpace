package com.oops.chapter1;

public class OopsBasics {
    public static void main(String[] args) {
        //use new keyword to create an object
        Student s1 = new Student();
        //Print to see the default values for object properties
        System.out.println(s1.name + " of roll no." + s1.rollNo + " obtained percentile " +  s1.marks);
        //assign values to object properties
        s1.name = "Rohan";
        s1.rollNo = 1;
        s1.marks = 92f;
        s1.read();
        System.out.println(s1.name + " of roll no." + s1.rollNo + " obtained percentile " +  s1.marks);

        //pass the arguments directly when creating an object
        Student s2 = new Student(2, "Kishan", 99f);
        System.out.println(s2.name + " of roll no." + s2.rollNo + " obtained percentile " +  s2.marks);

        Student s3 = new Student();
        System.out.println(s3.name + " of roll no." + s3.rollNo + " obtained percentile " +  s3.marks);


        //u can assign an object to another object
        //Now s4 and s2 are pointing to same object in memory [heap]
        Student s4 = s2;
        System.out.println(s4.name + " of roll no." + s4.rollNo + " obtained percentile " +  s4.marks);

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

    //No param constructor
    //can also call a constructor inside constructor
    Student(){
        this(0, "Default", 0f);
        System.out.println("constructor called");
    }

    //Parameterized constructor
    //use this keyword to set properties of a particular object
    //can also pass ann object as parameter
    Student(int rollNo, String name, float marks){
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }
}
