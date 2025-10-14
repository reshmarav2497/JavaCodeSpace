import java.util.Scanner;

public class MergeSortedArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements of an array in array 1 ");
        int n = sc.nextInt();

        int[] arr1 = new int[n];
        System.out.println("Enter " + n + " elements : ");
        for(int i = 0; i < n; i++){
            arr1[i] = sc.nextInt();
        }

        System.out.print("Array elements = ");
        for(int num : arr1){
            System.out.print(num + " ");
        }
        System.out.println("");

        System.out.println("Enter number of elements of an array in array 2 ");
        int m = sc.nextInt();

        int[] arr2 = new int[n];
        System.out.println("Enter " + n + " elements : ");
        for(int i = 0; i < n; i++){
            arr2[i] = sc.nextInt();
        }

        System.out.print("Array elements = ");
        for(int num : arr2){
            System.out.print(num + " ");
        }
        System.out.println("");

        sc.close();

        int[] finArr = sortedArray(arr1, n, arr2, m);

        System.out.print("Sorted array = ");
        for(int num : finArr){
            System.out.print(num + " ");
        }
        System.out.println("");
    }

    public static int[] sortedArray(int[] arr1, int n, int[] arr2, int m){
        int[] finArr = new int[n + m];
        int left = 0, right = 0, index = 0;

        while (left < n && right < m){
            if(arr1[left] < arr2[right]){
                finArr[index] = arr1[left];
                left++;
            }else{
                finArr[index] = arr2[right];
                right++;
            }
            index++;
        }

        while(left < n){
            finArr[index] = arr1[left];
            left++;
            index++;
        }

        while(right < m){
            finArr[index] = arr2[right];
            right++;
            index++;
        }

        return finArr;
    }

    //Time Complexity --> O(m+n)
    //Space Complexity --> O(m+n)
}
