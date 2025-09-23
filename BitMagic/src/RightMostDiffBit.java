import java.util.Scanner;

public class RightMostDiffBit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter m value : ");
        int m = sc.nextInt();
        System.out.println("Enter n value : ");
        int n = sc.nextInt();
        sc.close();

        if(m == n) {
            System.out.println("Numbers are same.");
            return;
        }
        int pos = 1;
        while(((m % 2)^(n % 2)) == 0){
            m = m >> 1;
            n = n >> 1;
            pos++;
        }

        System.out.println("Different bit found in position - " + pos);

// O(1) time complexity
//        int x = (m ^ n);
//
//        if(x == 0){
//            System.out.println("Numbers are same");
//            return;
//        }
//
//        int pos = (int)(Math.log((x & -x)) / Math.log(2)) + 1;
//
//        System.out.println("Different bit found in position - " + pos);

    }

    //Time Complexity --> max(log m, log n)
    //Space Complexity --> O(1);
}
