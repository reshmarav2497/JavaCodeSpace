package com.oops.chapter6;

public class GenericList<T> {
    private T[] items = (T[]) new Object[10];
    private int count;

    public void add(T item){
        items[count++] = item;
    }

    public T get(int index){
        return items[index];
    }

    public <T> void printData(T data){
        System.out.println(data);
    }
}
