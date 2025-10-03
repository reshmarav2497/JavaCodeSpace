import java.util.Scanner;

public class SumOfNnaturalNums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number n: ");
        int n = sc.nextInt();
        sc.close();

        System.out.println(getSum(n));
    }

    public static int getSum(int n) {
        if(n == 0) return 0;
        return n + getSum(n-1);
    }

    //Time Complexity --> O(n)
    //Space Complexity --> O(n)
}
