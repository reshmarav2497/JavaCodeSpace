import java.util.Scanner;

public class SwapEvenOddBits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number n : ");
        int n = sc.nextInt();
        sc.close();

        int evenBits = n & 0xAAAAAAAA;
        int oddBits = n & 0x55555555;

        evenBits >>= 1;
        oddBits <<= 1;

        int res = evenBits | oddBits;
        System.out.println("Swapped value is = " + res);
    }

    //Time Complexity --> O(1)
    //Space Complexity --> O(1)
}
