package com.oops.chapter3.inheritance;

public class Bird extends Animal {
    boolean canFly;

    Bird() {
        canFly = false;
    }

    void canBirdFly(boolean canFly){
        System.out.println(canFly ? "can Fly" : "cannot fly");
    }
}
