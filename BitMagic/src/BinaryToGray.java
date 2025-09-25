import java.util.Scanner;

public class BinaryToGray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number n: ");
        int n = sc.nextInt();
        sc.close();

        int ans = n;
        while(n > 0){
            if(n == ans){
                ans = n%2;
            }else{
                ans += (ans ^ (n%2));
            }
            n /= 2;
        }
        System.out.println(ans);
    }

    //Time Complexity --> O(log n)
    //Space Complexity --> O(1)
}
