import java.util.Scanner;

public class SumOfTwoWithoutPlusMinus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number a : ");
        int a = sc.nextInt();
        System.out.println("Enter number b : ");
        int b = sc.nextInt();
        sc.close();

        while(b != 0){
            int carry = ((a & b) << 1);
            a = a^b;
            b = carry;
        }

        System.out.println("Sum = " + a);
    }

    //Time Complexity --> O(1)
    //Space Complexity --> O(1)
}
