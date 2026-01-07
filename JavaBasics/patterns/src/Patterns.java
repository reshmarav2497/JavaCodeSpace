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

    //Pyramid
    public static void pattern4(int n){
        for(int i = 1; i <= n; i++){
            int spaces = n - i;
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            for(int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pattern5(int n){
        for (int i = 1; i <= (2*n)-1; i++) {
            int cols = (i <= n) ? i : n - (i - n);
            for (int j = 1; j <= cols; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pattern6(int n){
        for (int i = 1; i <= (2*n)-1; i++) {

            //spaces
            int spaces = (i <= n) ? (n-i) : (i-n);
            for (int s = 1; s <= spaces; s++) {
                System.out.print(" ");
            }

            //columns
            int cols = (i <= n) ? i : n - (i - n);
            for (int j = 1; j <= cols; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }

    public static void pattern7(int n){
        for (int i = 1; i <= n; i++) {

            //spaces
            for (int s = 1; s <= (n - i); s++) {
                System.out.print(" ");
            }

            //columns

            for(int j = i; j >= 1; j--){
                System.out.print(j);
            }

            for(int k = 2; k <= i; k++){
                System.out.print(k);
            }

            System.out.println();
        }

    }

    public static void pattern8(int n) {
        for (int i = 1; i <= 2 * n - 1; i++) {

            //spaces
            int spaces = (i <= n) ? (n - i) : (i - n);
            for (int s = 1; s <= spaces; s++) {
                System.out.print(" ");
            }

            //columns

            int cols = (i <= n) ? i : n - (i - n);
            for (int j = cols; j >= 1; j--) {
                System.out.print(j);
            }

            for (int k = 2; k <= cols; k++) {
                System.out.print(k);
            }

            System.out.println();
        }
    }

    public static void pattern9(int n) {
        int size = 2 * n - 1;

        for (int i = 1; i <= size; i++) {

            for (int j = 1; j <= size; j++) {

                //calculate distance from each side

                int top = i - 1;
                int left = j - 1;
                int bottom = size - i;
                int right = size - j;

                int minDist = Math.min(Math.min(top, bottom), Math.min(left, right));

                System.out.print((n - minDist) + " ");
            }

            System.out.println();
        }
    }
}
