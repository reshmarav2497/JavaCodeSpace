import java.util.Scanner;

public class NoOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        sc.close();

        //no of digits = (log base 10 of n) + 1;
        int count = (int)Math.floor(Math.log10(n)) + 1;

//        int count = 0;
//        while(n!=0){
//            count++;
//            n /= 10;
//        }
        System.out.println("The number contains " + count + " digits." );
    }
}
