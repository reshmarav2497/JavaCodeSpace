package com.oops.chapter1;

public class WrapperClasses {
    public static void main(String[] args) {

        //1) Primitives
        //How java is pass by value and not reference
        int a = 10;
        int b = 20;

        swap(a,b);
        //Hence Java is always pass by value
        System.out.println(a + " " + b);

        //2) Objects
        //In case of objects the copy of reference [address is being passed]
        Employee e1 = new Employee();

        changeName(e1);
        System.out.println(e1.name);

        //3) Wrapper classes
        Integer num1 = 40;
        Integer num2 = 30;

        swapInteger(num1, num2);
        // Here also it won't modify the original values because of final
        System.out.println("The values of Integers a and b => " + num1 + " " + num2);
    }

    public static void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;

        System.out.println("Inside the method a and b values are local to it => " + a + " " + b);
    }

    public static void swapInteger(Integer a, Integer b){
        Integer temp = a;
        a = b;
        b = temp;

        System.out.println("Inside the method a and b values are local to it for Integer type as well => " + a + " " + b);
    }

    public static void changeName(Employee e){
        e.name = "Rohan Mishra";
    }
}

class Employee{
    String name;
    int age;

    Employee(){
        this.name = "Rohan";
        this.age = 30;
    }
}
