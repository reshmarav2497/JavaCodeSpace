import java.util.Scanner;

public class MaxIndexDiff {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements u want in an array ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Array elements = ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println("");

        sc.close();

        System.out.println("Maximum index difference = " + getMaxIndexDiff(arr));
    }

    public static int getMaxIndexDiff(int[] arr){
        int n = arr.length;
        int[] leftMin = new int[n];
        int[] rightMax = new int[n];

        //Create left min array
        leftMin[0] = arr[0];
        for (int i = 1; i < n; i++){
            leftMin[i] = Math.min(arr[i], leftMin[i-1]);
        }

        //Create the right max array
        rightMax[n-1] = arr[n-1];
        for (int j = n-2; j >= 0; j--){
            rightMax[j] = Math.max(arr[j], rightMax[j+1]);
        }

        int i = 0, j = 0, maxDiff = 0;
        while(i < n && j < n){
            if(leftMin[i] <= rightMax[j]){
                maxDiff = Math.max(maxDiff, j-i);
                j++;
            }else {
                i++;
            }
        }
        return maxDiff;
    }

    //Time Complexity --> O(n)
    //Space Complexity --> O(n)
}
