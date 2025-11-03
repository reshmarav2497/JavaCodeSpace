package com.oops.chapter4.accessmod;

public class Student {
    //1) private property
    private int marks;

    //2) public property
    public String schoolName = "ABC";

    //3) protected
    protected void study(){
        System.out.println("Studying..");
    }

    public void setMarks(int marks){
        this.marks = marks;
    }

    public int getMarks(){
        return marks;
    }
}
