import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number rows");
        int n = sc.nextInt();

        System.out.println("--------------------------");
        //square pattern
        Patterns.pattern1(n);

        System.out.println("--------------------------");
        //right triangle pattern
        Patterns.pattern2(n);

        System.out.println("--------------------------");
        //inverted triangle pattern
        Patterns.pattern3(n);

        System.out.println("--------------------------");
        //pyramid
        Patterns.pattern4(n);

        System.out.println("--------------------------");
        /*
            *
            * *
            * * *
            * *
            *
         */
        Patterns.pattern5(n);

        sc.close();
    }
}
