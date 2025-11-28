package com.oops.chapter7.enums;

enum Day {

    //public static and final
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATUREDAY, SUNDAY;

    //private
    Day(){
        System.out.println(this);
    }

    //can have variables, methods, constructors, abstract methods
    //can be defined outside the class or inside but not inside a method

}

public class Main {
    public static void main(String[] args) {
        Day d = Day.MONDAY;

        switch (d){
            case MONDAY -> System.out.println("1st");
            case TUESDAY -> System.out.println("2nd");
            case WEDNESDAY -> System.out.println("3rd");
            case THURSDAY -> System.out.println("4th");
            case FRIDAY -> System.out.println("5th");
            case SATUREDAY -> System.out.println("6th");
            case SUNDAY -> System.out.println("7th");
            default -> System.out.println("Invalid");
        }

        for(Day day : Day.values()){
            System.out.println("Day -> " + day);
        }

        System.out.println("Value of -> " + Day.valueOf("MONDAY"));
    }
}
