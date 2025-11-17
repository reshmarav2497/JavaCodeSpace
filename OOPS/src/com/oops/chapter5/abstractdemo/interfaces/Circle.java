package com.oops.chapter5.abstractdemo.interfaces;

public class Circle implements Shape{
    double r;

    Circle(double r){
        this.r = r;
    }

    @Override
    public double area() {
        return Math.PI * r * r;
    }
}
