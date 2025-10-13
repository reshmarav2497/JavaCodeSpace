package com.oops.chapter2;

public class Singleton {

    //create an instance field of type Singleton to store instance
    private static Singleton instance;

    //private constructor --> only singleton class can access
    private Singleton(){}

    //Provide a public static method to get the instance
    public static Singleton getInstance(){
        if(instance == null){
            instance = new Singleton();
            System.out.println("Called to create an instance");
        }

        return instance;
    }

}
