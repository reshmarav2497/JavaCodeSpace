import java.util.Scanner;

public class SparseNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        int n = sc.nextInt();
        sc.close();

        if((n & (n >> 1)) == 0){
            System.out.println("Number " + n + " is a sparse number.");
        }else{
            System.out.println("Number " + n + " is not a sparse number.");
        }
    }

    //Time Complexity --> O(1)
    //Space Complexity --> O(1)
}
