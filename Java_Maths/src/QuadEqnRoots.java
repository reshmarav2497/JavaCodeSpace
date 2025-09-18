import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class QuadEqnRoots {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a, b and c values : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        sc.close();

        System.out.println(getQuadRoots(a,b,c));
    }

    public static ArrayList<Integer> getQuadRoots(int a, int b, int c){
        if (a<=0){
            return new ArrayList<>(Arrays.asList(-1));
        }

        double d = Math.pow(b,2) - 4*a*c;
        if (d<0){
            return new ArrayList<>(Arrays.asList(-1));
        }

        double sqrt = Math.sqrt(d);
        double r1 = (-b + sqrt)/(2*a);
        double r2 = (-b - sqrt)/(2*a);

        int root1 = (int)Math.floor(r1);
        int root2 = (int)Math.floor(r2);

        //return the array list in descending order
        if(root1 > root2){
            return new ArrayList<>(Arrays.asList(root1,root2));
        }
        return new ArrayList<>(Arrays.asList(root2,root1));
    }
}
