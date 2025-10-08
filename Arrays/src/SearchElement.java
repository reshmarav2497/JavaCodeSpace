import java.util.Scanner;

public class SearchElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of the array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " + n + " Elements : ");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter element to search : ");
        int x = sc.nextInt();
        sc.close();

        int j;
        for(j = 0; j < n; j++){
            if(arr[j] == x){
                System.out.println("Element " + x + " found in position " + j);
                return;
            }
        }
        System.out.println("Element not found.");
    }

    //Time Complexity --> O(n)
    //Space Complexity --> O(1)
}
