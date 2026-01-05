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


        System.out.println("--------------------------");
        /*
             *
            * *
           * * *
            * *
             *
         */
        Patterns.pattern6(n);

        System.out.println("--------------------------");
        /*
                1
               212
              32123
             4321234
            543212345
         */
        Patterns.pattern7(n);

        System.out.println("--------------------------");
        /*
                1
               212
              32123
               212
                1
         */
        Patterns.pattern8(n);

        System.out.println("--------------------------");
        /*
               3 3 3 3 3
               3 2 2 2 3
               3 2 1 2 3
               3 2 2 2 3
               3 3 3 3 3
         */
        Patterns.pattern9(n);


        sc.close();
    }
}
