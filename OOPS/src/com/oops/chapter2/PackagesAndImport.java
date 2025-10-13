package com.oops.chapter2;

//import the class from package

import com.oops.chapter1.WrapperClasses;

import java.util.ArrayList;

public class PackagesAndImport {
    public static void main(String[] args) {
        //can use methods from different packages
        WrapperClasses.swap(10, 20);

        //You can access only public/protected members from different packages
        //Employee e1 = new Employee();

        //Built in classes that we can use
        ArrayList<Integer> arr = new ArrayList<>();
    }
}
