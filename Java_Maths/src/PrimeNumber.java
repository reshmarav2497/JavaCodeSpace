import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args){
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        sc.close();

        //Print if a number is prime
        System.out.println("Number " + n + (isPrime(n) ? " is Prime." : " is not a Prime."));

        //Print Prime factors of a number
        System.out.print("Prime factors of number " + n + " are : ");
        printPrimeFactors(n);

        // check if numbers less than "n" have exactly three divisors
        // only if n = p^2
        checkExactThreeDivisors(n);

    }

    public static boolean isPrime(int n){
        if(n <= 1) return false;

        if(n==2 || n==3) return true;

        if(n%2 == 0 || n%3==0) return false;

        for(int i = 5; i*i <= n; i+=6){
            if(n%i == 0 || n%(i+2) == 0){
                return false;
            }
        }

        return true;
    }

    public static void printPrimeFactors(int n){
        if(n <= 1){
            System.out.println("No Prime factors");
            return;
        }

        for(int i = 2; i*i <= n; i++){
            while(n%i == 0){
                System.out.print(i + " ");
                n /= i;
            }
        }
        if(n>1){
            System.out.println(n+ " ");
        }
    }

    public static void checkExactThreeDivisors(int n){
        int count = 0;
        System.out.print("The number " + n + " has ");
        for(int i = 2; i*i <= n; i++){
            if(isPrime(i)) {
                if (i * i <= n) {
                    count++;
                }
            }
        }

        System.out.print(count > 0 ? "a total of " + count +  " numbers which has exactly three divisors." : " 0 numbers with exact three divisors.");

    }
}
