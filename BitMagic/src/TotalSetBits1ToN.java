import java.util.Scanner;

public class TotalSetBits1ToN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        sc.close();

        System.out.println("The total bits from " + "1 to " + n + " is = " + getTotalCount(n));
    }

    public static int getTotalCount(int n){
        int j, k, j1 = 2, ans = 0;
        n++;

        for(j = 1; j <= n; ){
            k = n/j1;
            ans += k * (j1/2);

            k = n % j1;

            if(k > (j1/2)){
                ans += k - (j1/2);
            }

            j *= 2;
            j1 = j * 2;
        }

        return ans;
    }

    //Time Complexity --> O(log n)
    //Space Complexity --> O(1)
}
