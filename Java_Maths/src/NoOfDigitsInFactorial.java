import java.util.Scanner;

public class NoOfDigitsInFactorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // We can also use Kamenetsky's formula
        // digits = ((n * log base 10(n/e)) + (log base 10(2* PI * n))/2) + 1
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        sc.close();

        double res = 0;
        for (int i = 2; i<=n; i++){
            res += Math.log10(i);
        }
        int noOfDigits = (int)Math.floor(res) + 1;

        System.out.println("No of Digits in " + n + "! = " + noOfDigits);
    }
}
