import java.util.Scanner;

public class BinaryToGray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number n: ");
        int n = sc.nextInt();
        sc.close();

//        int prev = 0;
//        if(n != 0){
//            prev = n%2;
//        }else{
//            System.out.println(0);
//        }
//        int ans = 0, pow = 1;
//        while(n > 0){
//            n /= 2;
//            int rem = n % 2;
//            int xor = (rem ^ prev);
//            ans += xor * pow;
//            pow *= 2;
//            prev = rem;
//        }
//        System.out.println(ans);

        //Efficient solution with O(1) TC
        System.out.println(n ^ (n>>1));
    }

    //Time Complexity --> O(log n) --> Brute force
    //Space Complexity --> O(1)
}
