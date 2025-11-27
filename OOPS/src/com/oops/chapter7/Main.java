package com.oops.chapter7;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        //ArrayList
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        //Iterating over list -> forEach + lambda
        list.forEach(e -> System.out.print(e + " "));

        System.out.println("");

        System.out.println("Size -> " + list.size());

        list.remove(1);

        System.out.println("Is 3 available -> " + list.contains(3));

        List<Integer> list1 = new LinkedList<>();

        list1.add(4);
        list1.add(5);
        list1.add(6);

        for(Integer item : list1){
            System.out.println(item);
        }

        List<Integer> list2 = new ArrayList<>();
        list2.add(8);
        list2.add(2);
        list2.add(9);
        list2.add(1);

        Collections.sort(list2);

        System.out.println("sorted list -> " + list2);

        ArrayList<String> list3 = new ArrayList<>();

        list3.add("Apple");
        list3.add("Banana");
        list3.add("Kiwi");

        System.out.println("List 3 -> " + list3);

        Vector<Float> list4 = new Vector<>();

        list4.add(2.4f);
        list4.add(3.144f);
        list4.add(6.77f);
        list4.add(9.8f);

        System.out.println("List 4 -> " + list4);

    }

}
