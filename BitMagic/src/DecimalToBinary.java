import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        sc.close();

        int binary = convertDecToBin(n);
        System.out.println("The binary representation of number " + n + " is = " + binary);

        int dec = convertBinToDec(binary);
        System.out.println("The decimal representation of binary " + binary + " is = " + dec);
    }

    public static int convertDecToBin(int n){
        int ans = 0;
        int pow = 1;
        while(n>0){
            int rem = n%2;
            n /= 2;

            ans += rem * pow;
            pow *= 10;
        }
        return ans;
    }

    public static int convertBinToDec(int n){
        int ans = 0;
        int pow = 1;
        while(n>0){
            int lastDig = n%10;
            n = n/10;

            ans += lastDig * pow;
            pow *= 2;
        }
        return ans;
    }

    //Time Complexity --> O(log n)
    //Space Complexity --> O(1)
}
