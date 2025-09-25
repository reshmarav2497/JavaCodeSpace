import java.util.Scanner;

public class RightMostDiffBitInTwoNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number a :");
        int a = sc.nextInt();
        System.out.println("Enter a number b :");
        int b = sc.nextInt();
        sc.close();

        int m = (a ^ b);
        if(m == 0){
            System.out.println("Both the numbers are same.");
            return;
        }

        int pos = (int)((Math.log((m & -m))) / (Math.log(2))) + 1;
        System.out.println("The different bits are present in pos = " + pos);
    }

    //Time Complexity --> O(log n)
    //Space Complexity --> O(1)
}
