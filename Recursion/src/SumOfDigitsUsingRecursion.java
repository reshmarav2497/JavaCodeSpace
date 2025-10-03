import java.util.Scanner;

public class SumOfDigitsUsingRecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number n : ");
        int n = sc.nextInt();
        sc.close();

        System.out.println(getSum(n));
    }

    public static int getSum(int n){
        if(n == 0) return 0;
        return (n%10) + getSum(n/10);
    }

    //Time Complexity --> O(log n)
    //Space Complexity --> O(log n)
}
