import java.util.Scanner;

public class IterativePower {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();

        System.out.println("Enter the power : ");
        int p = sc.nextInt();

        sc.close();

        int res = 1;
        while(p>0){
            if(p%2 != 0){
                res *= n;
            }
            n *= n;
            p /= 2;
        }
        System.out.println("The value = " + res);
    }
}
