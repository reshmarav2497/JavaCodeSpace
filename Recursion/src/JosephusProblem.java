import java.util.Scanner;

public class JosephusProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of people n : ");
        int n = sc.nextInt();
        System.out.println("Enter the K value : ");
        int k = sc.nextInt();
        sc.close();

        //return  +1 when the position starts from 1 and not 0
        System.out.println("Position of saved = " + (jOS(n, k) + 1));
    }

    public static int jOS(int n, int k){
        if(n == 1) return 0;
        //Modulo n to make sure the result is less than the n value
        return ((jOS(n-1, k) + k) % n);
    }

    //Time Complexity --> O(n)
    //Space Complexity --> O(n)
}
