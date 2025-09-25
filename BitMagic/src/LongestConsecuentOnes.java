import java.util.Scanner;

public class LongestConsecuentOnes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        sc.close();

        int count = 0, ans = 0;
        while(n > 0){
            if((n%2) == 1){
                count++;
                ans = Math.max(ans, count);
            }else{
                count = 0;
            }
            n /= 2;
        }

        System.out.println("Longest consequent ones count = " + ans);
    }

    //Time Complexity --> O(log n)
    //Space Complexity --> O(1)
}
