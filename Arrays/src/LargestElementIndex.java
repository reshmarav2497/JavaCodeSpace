import java.util.Scanner;

public class LargestElementIndex {
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

        System.out.println("Maximum element index = " + getMaxIndex(arr));
    }

    public static int getMaxIndex(int[] arr){
        int n = arr.length, res = 0;
        for(int i = 1; i < n; i++){
            if(arr[i] > arr[res]){
                res = i;
            }
        }
        return res;
    }

    //Time Complexity --> O(n)
    //Space Complexity --> O(1)
}
