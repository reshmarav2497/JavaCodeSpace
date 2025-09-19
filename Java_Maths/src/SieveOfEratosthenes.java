import java.util.Scanner;

public class SieveOfEratosthenes {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        sc.close();

        boolean[] primeArr = new boolean[n+1];
        for(int i = 0 ; i<=n ; i++){
            primeArr[i] = true;
        }

        System.out.print("Prime numbers below " + n + " are : ");
        for(int i = 2; i<=n; i++){
            if(primeArr[i] == true){
                System.out.print(i + " ");
            }

            for(int j = i * i; j<=n; j+=i){
                primeArr[j] = false;
            }
        }
    }
}
