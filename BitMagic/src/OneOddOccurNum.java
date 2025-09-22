import java.util.Arrays;
import java.util.Scanner;

public class OneOddOccurNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in an array : ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.print("Enter the array elements : ");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        sc.close();

        int res = 0;
        for(int num : arr){
            res ^= num;
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(res);

        //Time Complexity --> O(n)
        //Space Complexity --> O(1)
    }
}
