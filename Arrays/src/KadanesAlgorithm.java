import java.util.Scanner;

public class KadanesAlgorithm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements of an array ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements : ");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.print("Array elements = ");
        for(int num : arr){
            System.out.print(num + " ");
        }
        System.out.println("");
        sc.close();

        System.out.println("Maximum sum of sub array = " + getSum(arr, n));
    }

    public static int getSum(int[] arr, int n){
        int start = 0, end = 0, tempStart = 0;
        int maxSum = Integer.MIN_VALUE, currentSum = 0;

        for(int i = 0; i< n; i++){
            currentSum += arr[i];

            if(currentSum > maxSum){
                maxSum = currentSum;
                start = tempStart;
                end = i;
            }

            if (currentSum < 0){
                currentSum = 0;
                tempStart = i+1;
            }
        }

        System.out.println("Sub array elements are = ");
        for(int i = start; i <= end; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println("");

        return maxSum;
    }

    //Time Complexity --> O(n)
    //Space Complexity --> O(1)
}
