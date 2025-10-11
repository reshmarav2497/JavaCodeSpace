package com.oops.chapter1;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;

public class GarbageCollection {
    public static void main(String[] args) throws InterruptedException {

        //In Java, garbage collection is done automatically
        //It cleans up all the unreachable objects
        //Jvm does the cleanup when it feels there is memory issue

        A a1;
        for(int i = 0; i < 1000; i++){
            a1 = new A(i);
        }

        //Alternate ways to request garbage collection
        System.gc();
        //(or)
        Runtime.getRuntime().gc();

        System.out.println("GC requested");

        //Using PhantomReference + ReferenceQueue (Advanced, Modern Way)
        ReferenceQueue<A> queue = new ReferenceQueue<>();
        A a = new A();

        PhantomReference<A> ref = new PhantomReference<>(a, queue);

        // Remove strong reference
        a = null;

        System.gc(); // Request GC

        // Wait for GC to enqueue the phantom reference
        if (queue.remove(5000) != null) { // wait max 5 seconds
            System.out.println("Garbage collected!");
        } else {
            System.out.println("GC did not happen yet");
        }
    }
}

class  A{
    int num = 0;

    A(){}

    A(int n){
        this.num = n;
        System.out.println("Object created: " + n);
    }

    //Deprecated method
    //Which runs when garbage collection starts
//    @Override
//    protected void finalize() throws Throwable {
//        System.out.println("Garbage collected");
//    }
}
