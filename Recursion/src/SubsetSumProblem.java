import java.util.Arrays;
import java.util.Scanner;

public class SubsetSumProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array n : ");
        int n = sc.nextInt();

        System.out.println("Enter the array elements : ");
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the target sum : ");
        int sum = sc.nextInt();

        System.out.println(Arrays.toString(arr));
        sc.close();

        System.out.println("subset count = " + subsetSum(arr, n, sum));
    }

    public static int subsetSum(int[] arr, int n, int sum){
        if(n == 0){
            return ((sum == 0) ? 1 : 0);
        }

        return subsetSum(arr, n-1, sum) + subsetSum(arr, n-1, sum - arr[n-1]);
    }

    //Time Complexity --> O(2^n)
    //Space Complexity --> O(n)
}
