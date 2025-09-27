import java.util.Scanner;

public class ReverseBits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        sc.close();

        int rev = 0;
        for(int i = 0; i <= 31; i++){
            int bit = n & 1;
            rev = rev << 1;
            rev = rev | bit;
            n = n >> 1;
        }

        System.out.println("Reverse is = " + rev);
    }

    //Time Complexity --> O(1)
    //Space Complexity --> O(1)
}
