import java.util.Scanner;

public class DivideInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a dividend n : ");
        int dividend = sc.nextInt();
        System.out.println("Enter a divisor d: ");
        int divisor = sc.nextInt();
        sc.close();

        System.out.println(divideNumber(dividend, divisor));

    }

    public static int divideNumber(int dividend, int divisor){
        if(dividend == divisor) return 1;

        if (dividend == Integer.MIN_VALUE && divisor == -1) return Integer.MAX_VALUE;

        boolean sign = true;

        if(dividend <= 0 && divisor > 0) sign = false;
        if(dividend >= 0 && divisor < 0) sign = false;

        long n = Math.abs((long)dividend);
        long d = Math.abs((long)divisor);
        long q = 0L;

        while(n >= d){
            long count = 0;
            while((d << (count+1)) <= n){
                count++;
            }
            q += (1 << count);
            n -= (d << count);
        }

        if((q == (1 << 31)) && sign){
            return Integer.MAX_VALUE;
        }

        if((q == (1 << 31)) && !sign){
            return Integer.MIN_VALUE;
        }

        return sign ? (int)q : (int)-q;
    }


    //Time Complexity --> O(log n)^2
    //Space Complexity --> O(1)
}
