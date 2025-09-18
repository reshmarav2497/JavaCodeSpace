import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter number of elements : ");
        int arrLength = sc.nextInt();

        int [] arr = new int[arrLength];

        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        sc.close();

        calculateSum(arr);
    }

    public static void calculateSum(int[] arr){
        int sum = 0;
        for(int num : arr){
            sum += num;
        }
        System.out.println("Sum of elements : " + sum);
    }
}
