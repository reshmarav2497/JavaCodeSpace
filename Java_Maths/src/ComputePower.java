import java.util.Scanner;

public class ComputePower {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number and the power value : ");
        int n = sc.nextInt();
        int x = sc.nextInt();

        sc.close();

        System.out.println("The value is = " + getPower(n,x));
    }

    public static int getPower(int n, int x){
        if (x == 0) return 1;

        int temp = getPower(n, x/2);
        temp = temp * temp;
        if (x % 2 == 0){
            return temp;
        }
        return temp * n;
    }
}
