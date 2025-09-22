import java.util.Scanner;

public class MaximumAndPair {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements in an array : ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        sc.close();

        int ans  =  0;
        for(int i = 31; i >= 0; i--){
            int x = (ans | (1 << i));

            int count = 0;

            for(int num : arr){
                if((num & x) == x){
                    count++;
                }
            }

            if(count >= 2){
                ans = x;
            }
        }
        System.out.println(ans);

        //Time Complexity --> O(n)
        //Space Complexity --> O(1)
    }
}
