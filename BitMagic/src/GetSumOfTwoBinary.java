import java.math.BigInteger;
import java.util.Scanner;

public class GetSumOfTwoBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number in binary a : ");
        String a = sc.nextLine();
        System.out.println("Enter a number in binary b : ");
        String b = sc.nextLine();
        sc.close();

        BigInteger x = new BigInteger(a,2);
        BigInteger y = new BigInteger(b,2);

        BigInteger sum = x.add(y);
        System.out.println(sum.toString(2));
    }


    //Time Complexity --> O(n)
    //Space Complexity --> O(n)
}
