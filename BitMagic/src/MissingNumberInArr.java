import java.util.Scanner;

public class MissingNumberInArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of arr : ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter " + n + " values - ");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        sc.close();

        int actual = 0;
        for(int i = 0; i < arr.length + 1; i++){
            actual ^= i;
        }

        for(int num : arr){
            actual ^= num;
        }
        System.out.println("Missing number is = " + actual);
    }

    //Time Complexity --> O(n)
    //Space Complexity --> O(1)
}
