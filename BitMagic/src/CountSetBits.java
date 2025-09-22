import java.util.Scanner;

public class CountSetBits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        sc.close();

        int res = 0;
        while(n!=0){
            n &= (n-1);
            res++;
        }

        System.out.println("No of set bits in the number is = " + res);

        //Time Complexity --> O(log n)
        //Space Complexity --> O(1)
    }
}
