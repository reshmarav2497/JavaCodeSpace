import java.util.Arrays;
import java.util.Scanner;

public class TwoOddOccurNums {
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

        int x = 0;
        for(int num : arr){
            x ^= num;
        }

        int k = (x & (~(x-1)));
        int res1 = 0, res2 = 0;
        for(int num : arr){
            if((num & k) != 0){
                res1 ^= num;
            }else{
                res2 ^= num;
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Two odd occurring numbers are : " + res1 + " " + res2);

        //Time Complexity --> O(n)
        //Space Complexity --> O(1)
    }
}
