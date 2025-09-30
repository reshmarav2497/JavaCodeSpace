import java.util.Scanner;

public class FibonacciUsingRecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number n : ");
        int n = sc.nextInt();
        sc.close();

        System.out.println(getNthFibonacci(n));
    }

    public static int getNthFibonacci(int n){
        if(n <= 1) return n;

        return getNthFibonacci(n-1) + getNthFibonacci(n-2);
    }

    //Time Complexity --> O(2^n)
    //Space Complexity --> O(n)
}
