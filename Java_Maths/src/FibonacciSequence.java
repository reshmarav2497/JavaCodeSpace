import java.util.Scanner;

public class FibonacciSequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter nth term : ");
        int nthTerm = sc.nextInt();

        sc.close();


        //using recursion
        System.out.println(usingRecursion(nthTerm)); //gives nth term of sequence
        for (int i = 0; i <= nthTerm ; i++){
            System.out.print(usingRecursion(i) + " "); //prints the sequence
        }

        //using arrays to store sequence
        usingArrayMethod(nthTerm);

        //using substitution
        System.out.println(usingSubstitution(nthTerm)); //prints nth term
        for(int i = 0; i < nthTerm ; i++){
            System.out.print(usingSubstitution(i) + " "); //prints sequence of first n terms
        }
    }

    public static int usingRecursion(int n) {
        if(n==0 || n==1){
            return n;
        }
        return usingRecursion(n-1) + usingRecursion(n-2);
    }

    public static void usingArrayMethod(int n){
        int[] arr = new int[n];

        if(n>0) arr[0] = 0;
        if(n>1) arr[1] = 1;

        for(int i=2; i<n; i++){
            arr[i] = arr[i-1] + arr[i-2];
        }

        System.out.print("Fibonacci sequence is : ");
        for(int num : arr){
            System.out.print(num + " ");
        }
        System.out.println(" ");
        System.out.println("nth term of sequence is : " + (int)(arr[n-1] + arr[n-2]));
    }

    public static int usingSubstitution(int n){
        if(n==0 || n==1) return n;

        int a = 0, b = 1, c = 0;
        for(int i = 2 ; i <= n; i++){
            c = a + b;
            a = b;
            b = c;
        }
        return c;
    }
}
