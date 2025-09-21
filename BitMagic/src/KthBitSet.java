import java.util.Scanner;

public class KthBitSet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        System.out.println("Enter kth value : ");
        int k = sc.nextInt();
        sc.close();

        int x = 1 << (k-1);
        // & --> 1&1 = 1
        if((n&x) != 0){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
