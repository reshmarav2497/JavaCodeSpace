import java.util.Scanner;

public class Print1ToNRecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number n : ");
        int n = sc.nextInt();
        sc.close();

        print1ToN(n);
    }

    public static void print1ToN(int n) {
        if(n == 0) return;
        print1ToN(n-1);
        System.out.println(n);
    }

    //Time Complexity --> O(n)
    //Space Complexity --> O(n)
}
