import java.util.Scanner;

public class CountDigitsUsingRecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number n: ");
        int n = sc.nextInt();
        sc.close();

        System.out.println("Number " + n + " contains " + getCount(n) + " digits.");
    }

    public static int getCount(int n) {
        if(n < 0) n = -n;
        if(n < 10) return 1;

        return 1 + getCount(n/10);
    }

    //Time Complexity --> O(log n)
    //Space Complexity --> O(log n)
}
