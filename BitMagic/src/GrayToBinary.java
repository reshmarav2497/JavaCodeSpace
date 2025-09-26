import java.util.Scanner;

public class GrayToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number n : ");
        int g = sc.nextInt();
        sc.close();

        int result = g;
        while(g > 0){
            g = g >> 1;
            result = result ^ g;
        }
        System.out.println(result);
    }

    //Time Complexity --> O(log n)
    //Space Complexity --> O(1)
}
