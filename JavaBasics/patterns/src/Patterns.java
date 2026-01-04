public class Patterns {

    //Square Pattern
    public static void pattern1(int n){
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    //Right Triangle Pattern
    public static void pattern2(int n){
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    //Inverted Triangle Pattern
    public static void pattern3(int n){
        for(int i = 1; i <= n; i++){
            for(int j = n-i+1; j >= 1; j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
