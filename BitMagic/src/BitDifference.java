import java.util.Scanner;

public class BitDifference {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of a : ");
        int a = sc.nextInt();
        System.out.println("Enter value of b : ");
        int b = sc.nextInt();
        sc.close();

        int m = (a ^ b);
        int ans = 0;

        while(m > 0){
            m = (m & (m-1));
            ans++;
        }
        System.out.println("The bit difference in a and b = " + ans);
    }

    //Time Complexity --> O(log n)
    //Space Complexity --> O(1)
}
