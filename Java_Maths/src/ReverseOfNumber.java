import java.util.Scanner;

public class ReverseOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = Math.abs(sc.nextInt());

        sc.close();

        //Note : be aware of integer overflow and underflow
        int rev = 0;
        while(n > 0){
            int lastDigit = n%10;
            rev = rev*10 + lastDigit;
            n /= 10;
        }

        System.out.println("The reverse is = " + rev);
    }
}
