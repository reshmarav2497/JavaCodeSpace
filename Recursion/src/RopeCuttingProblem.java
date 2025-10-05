import java.util.Scanner;

public class RopeCuttingProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the rope : ");
        int n = sc.nextInt();
        System.out.println("Enter a, b and c values : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        sc.close();

        System.out.println(maxPieces(n, a, b, c));
    }

    public static int maxPieces(int n, int a, int b, int c){
        if(n == 0) return 0;
        if(n < 0) return -1;

        int res = Math.max(maxPieces(n-a, a, b, c), Math.max(maxPieces(n-b, a, b, c), maxPieces(n-c, a, b, c)));

        if(res == -1) return -1;
        return res + 1;
    }

    //Time Complexity --> O(3^n)
    //Space Complexity --> O(n)
}
