import java.util.Scanner;

public class LuckyNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a value n : ");
        int n = sc.nextInt();
        sc.close();

        System.out.println((luckyNum(n,2))  ? n + " is a Lucky Number." : n + " is not a Lucky Number.");
    }

    public static boolean luckyNum(int n, int k) {
        if(k > n) return true;
        if(n % k == 0) return false;
        n = n - (n/k);
        return luckyNum(n, k+1);
    }

    //Time Complexity --> O(n)
    //Space Complexity --> O(n)
}
