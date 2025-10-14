import java.util.Scanner;

public class EquilibriumIndexArray {
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

        System.out.println("Equilibrium index = " + getIndex(arr, n));
    }

    public static int getIndex(int[] arr, int n){
        int sum = 0, leftSum = 0, index = -1;

        for(int num : arr){
            sum += num;
        }

        for(int i = 0; i < n; i++){
            sum -= arr[i];
            if(sum == leftSum){
                index = i;
                break;
            }else{
                leftSum += arr[i];
            }
        }
        return index;
    }

    //Time Complexity --> O(n)
    //Space Complexity --> O(1)
}
