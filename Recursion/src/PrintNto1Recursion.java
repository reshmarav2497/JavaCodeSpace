import java.util.Scanner;

public class PrintNto1Recursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number n : ");
        int n = sc.nextInt();
        sc.close();

        printNTo1(n);
    }

    public static void printNTo1(int n) {
        if(n == 0) return;

        System.out.println(n);
        printNTo1(n-1);
    }

    //Time Complexity --> O(n)
    //Space Complexity --> O(n)
}
