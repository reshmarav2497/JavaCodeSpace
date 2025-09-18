import java.util.Scanner;

public class TrailingZerosInFact {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number > 0 : ");
        int n = sc.nextInt();

        int res = 0;

        for(int i=5; i<=n; i*=5){
            res += n/i;
        }

        System.out.println( n + "! contains " + res + " trailing zeros.");
    }
}
