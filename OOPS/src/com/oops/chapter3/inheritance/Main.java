package com.oops.chapter3.inheritance;

public class Main {
    public static void main(String[] args) {
        Dog d = new Dog();
        System.out.println(d.lifeSpan);
        System.out.println(d.name);

        d = new Dog(15, "Bobby");
        System.out.println(d.name);
        System.out.println(d.lifeSpan);

        d.eat();

        //Child cannot access private members of inherited class
        //System.out.println(d.gender);

        Eagle e = new Eagle();
        e.canBirdFly(e.canFly);

        /*
        ------------------------------------------------------------
        -->Types of Inheritance
        ------------------------------------------------------------
        1) Single Inheritance -> One parent - One child

        2) Multilevel Inheritance -> A -> B -> C

        3) Hierarchical Inheritance -> One Parent - Multiple children

        4) Multiple Inheritance
                --> One child - Multiple parents
                --> Not possible in java directly
                --> Possible using Interfaces

        5) Hybrid Inheritance
                --> Combination of single and multiple inheritance
                --> Again possible using interfaces

        ------------------------------------------------------------
         */
    }

}
