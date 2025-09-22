import java.util.Scanner;

public class PowerOfTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n  = sc.nextInt();
        sc.close();

        if(n==0) System.out.println("The number is not a power of two.");

        boolean val = (n & (n-1)) == 0;
        System.out.println("The number is " + (val ? "a power of 2." : "not a power of two."));

        //Time Complexity --> O(1)
        //Space Complexity --> O(1)
    }
}
