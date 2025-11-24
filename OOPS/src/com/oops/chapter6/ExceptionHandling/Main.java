package com.oops.chapter6.ExceptionHandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            int arr[] = new int[2];
            System.out.println("element at index 5 => " + arr[5]);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Exception => " + e);
            System.out.println("Invalid Index");
        } catch (Exception e) {
            System.out.println("Exception => " + e);
        }

        try {
            int a = 10;
            int b = 0;
            int c = divide(a, b);
        } catch (Exception e){
            System.out.println("Exception => " + e);
        }

        try(BufferedReader br = new BufferedReader(
                new FileReader("Dummy.txt"))){
            String line;
            while((line = br.readLine()) != null){
                System.out.println("Data => " + line);
            }

        }catch (IOException e){
            System.out.println("Exception => " + e);
        }
    }

    public static int divide(int a, int b) throws CustomException{
        if(b == 0){
            throw new CustomException("Divisor is Invalid");
        }
        return a/b;
    }
}
