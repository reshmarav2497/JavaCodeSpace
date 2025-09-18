import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a and b values : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();
        while (a>0 && b>0){
            if(a>b){
                a %= b;
            }else{
                b %= a;
            }
        }
        System.out.println("GCD IS = " + (a == 0 ? b : a));
    }
}
