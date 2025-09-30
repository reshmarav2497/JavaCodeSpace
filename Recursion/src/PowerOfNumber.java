import java.util.Scanner;

public class PowerOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        sc.close();

        int rev = reverseNumber(n);
        System.out.println(getPower(n, rev));
    }

    public static int reverseNumber(int n) {
        int rev = 0;
        while (n > 0) {
            rev = rev * 10 + n % 10;
            n = n / 10;
        }
        return rev;
    }

    public static int getPower(int b, int p) {
        if (b == 0) return 0;
        if (p == 0) return 1;

        int res = getPower(b, p / 2) % 1000000007;
        res = (res * res) % 1000000007;

        if (p % 2 == 0) {
            return res;
        } else {
            return (b * res) % 1000000007;
        }
    }

    //Time Complexity --> O(log n)
    //Space Complexity --> O(log n)
}
