import java.util.Scanner;

public class PrefixSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array : ");
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

        System.out.println("Enter left and right for getting the desired sum");
        int l = sc.nextInt();
        int r = sc.nextInt();
        sc.close();

        System.out.println("sum of elements from " + l + " to " + r + " is = " + getSum(arr, n, l, r));
    }

    public static int getSum(int[] arr, int n, int l, int r){

        int[] prefix = new int[n];
        prefix[0] = arr[0];
        for(int i = 1; i < n; i++){
            prefix[i] = arr[i] + prefix[i-1];
        }

        System.out.print("Prefix array elements = ");
        for(int num : prefix){
            System.out.print(num + " ");
        }
        System.out.println("");

        if(l == 0){
            return prefix[r];
        }else{
            return prefix[r] - prefix[l-1];
        }
    }

    //Time Complexity --> O(n * q)
    //Space Complexity --> o(n)
}
