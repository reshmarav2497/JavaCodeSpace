import java.util.Scanner;

public class FirstSetBit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        sc.close();

        System.out.println("First set bit is at the position : " + findFirstSetBit(n));
    }

    public static int findFirstSetBit(int n) {
        if(n == 0) return 0;

        int pos = 1;
        while( (n&1) == 0){
            n = n >> 1;
            pos++;
        }
        return pos;
    }

    //Time Complexity --> O(log n)
    //Space Complexity --> O(1)
}
