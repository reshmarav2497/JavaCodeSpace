import java.util.Scanner;

public class AllDivisorsOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        sc.close();

        System.out.print("The factors of number " + n + " are : ");
        int i;
        for(i = 1; i*i <= n; i++ ){
            if(n%i == 0){
                System.out.print(i + " ");
            }
        }

        i--;

        for( ; i >=1 ; i--){
            if (n%i == 0 && n/i != i){
                System.out.print(n/i + " ");
            }
        }
    }
}
