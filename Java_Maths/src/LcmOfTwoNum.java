import java.util.Scanner;

public class LcmOfTwoNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of a and b : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();

        int abs = Math.abs(a*b);
        int gcd = getGCD(a,b);

        System.out.println("Lcm of " + a + " & " + b + " = " + abs/gcd);
    }

    public static int getGCD(int a, int b){
        while(a > 0 && b > 0){
            if(a>b){
                a %= b;
            }else{
                b %= a;
            }
        }
        return a == 0 ? b : a;
    }
}
