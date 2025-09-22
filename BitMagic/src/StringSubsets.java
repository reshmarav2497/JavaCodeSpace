import java.util.Scanner;

public class StringSubsets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string : ");
        String str = sc.nextLine();
        sc.close();

        int n = str.length();
        int k = (1 << n);

        for(int i = 0; i < k; i++){
            boolean s = false;
            for(int j = 0; j < n; j++){
                if((i & (1 << j)) != 0){
                    s = true;
                    System.out.print(str.charAt(j));
                }
            }
            if(!s) {
                System.out.print("_");
            }
            System.out.print(" ");
        }

        //Time Complexity --> O(2^n * n)
        //Space Complexity --> O(1)
    }
}
